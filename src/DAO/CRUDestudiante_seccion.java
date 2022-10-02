package DAO;

import Modelo.Estudiante;
import Modelo.Seccion;
import Modelo.EstudianteSeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDestudiante_seccion {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarEstudianteSeccion(EstudianteSeccion es_sc) {
        String sql = "INSERT INTO estudiante_seccion (seccion_id,estudiante_id)VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, es_sc.getSeccionID());
            ps.setString(2, es_sc.getEstudianteID());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public List ListarEstudianteSeccion() {
        List<EstudianteSeccion> ListaEsSc = new ArrayList();
        String sql = "SELECT * FROM estudiante_seccion";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EstudianteSeccion es_sc = new EstudianteSeccion();
                es_sc.setSeccionID(rs.getString("seccion_id"));
                es_sc.setEstudianteID(rs.getString("estudiante_id"));
                ListaEsSc.add(es_sc);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaEsSc;

    }

    public boolean EliminarEstudianteSeccion(String seccion_id, String estudiante_id) {
        String sql = "DELETE FROM estudiante_seccion WHERE seccion_id = ? and estudiante_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
            ps.setString(2, estudiante_id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean ModificarEstudianteSeccion(EstudianteSeccion es_sc, String idSeccion) {
        String sql = "UPDATE estudiante_seccion SET seccion_id = ? WHERE seccion_id=? and estudiante_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idSeccion);
            ps.setString(2, es_sc.getSeccionID());
            ps.setString(3, es_sc.getEstudianteID());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public EstudianteSeccion BuscarEstudianteSeccion(String seccion_id, String estudiante_id) {
        EstudianteSeccion sc_as = new EstudianteSeccion();
        String sql = "SELECT * FROM estudiante_seccion WHERE seccion_id=? and estudiante_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
            ps.setString(2, estudiante_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                sc_as.setSeccionID(rs.getString("seccion_id"));
                sc_as.setEstudianteID(rs.getString("estudiante_id"));
                sc_as.setNombreSeccion(buscarNombreSeccion(sc_as.getSeccionID(), sc_as.getEstudianteID()));
                sc_as.setNombreEstudiante(buscarNombreEstudiante(sc_as.getSeccionID(), sc_as.getEstudianteID()));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sc_as;
    }

    public String buscarNombreEstudiante(String seccion_id, String estudiante_id) {
        Estudiante es = new Estudiante();
        String sql = "SELECT nombre, apellido FROM estudiante e, estudiante_seccion es WHERE e.estudiante_id = es.estudiante_id and es.estudiante_id = ? and es.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
            ps.setString(2, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                es.setNombre(rs.getString("nombre"));
                es.setApellido(rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return es.getNombre() + " " + es.getApellido();
    }

    public String buscarNombreSeccion(String seccion_id, String estudiante_id) {
        Seccion sc = new Seccion();
        String sql = "SELECT nombre_seccion FROM seccion sc, estudiante_seccion es WHERE sc.seccion_id = es.seccion_id and es.estudiante_id = ? and es.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
            ps.setString(2, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                sc.setNombre(rs.getString("nombre_seccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sc.getNombre();
    }
}
