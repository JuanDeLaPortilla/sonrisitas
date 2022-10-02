package DAO;

import Modelo.Estudiante;
import Modelo.Apoderado;
import Modelo.EstudianteApoderado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDestudiante_apoderado {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarEstudianteApoderado(EstudianteApoderado es_ap) {
        String sql = "INSERT INTO estudiante_apoderado (apoderado_id,estudiante_id)VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, es_ap.getIdApoderado());
            ps.setString(2, es_ap.getIdEstudiante());
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

    public List ListarEstudianteApoderado() {
        List<EstudianteApoderado> ListaEsAp = new ArrayList();
        String sql = "SELECT * FROM estudiante_apoderado";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EstudianteApoderado es_ap = new EstudianteApoderado();
                es_ap.setIdApoderado(rs.getString("apoderado_id"));
                es_ap.setIdEstudiante(rs.getString("estudiante_id"));
                ListaEsAp.add(es_ap);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaEsAp;

    }

    public boolean EliminarEstudianteApoderado(String apoderado_id, String estudiante_id) {
        String sql = "DELETE FROM estudiante_apoderado WHERE apoderado_id = ? and estudiante_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, apoderado_id);
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

    public boolean ModificarEstudianteApoderado(EstudianteApoderado es_ap, String idApoderado) {
        String sql = "UPDATE estudiante_apoderado SET apoderado_id = ? WHERE apoderado_id=? and estudiante_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idApoderado);
            ps.setString(2, es_ap.getIdApoderado());
            ps.setString(3, es_ap.getIdEstudiante());
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

    public EstudianteApoderado BuscarEstudianteApoderado(String apoderado_id, String estudiante_id) {
        EstudianteApoderado es_ap = new EstudianteApoderado();
        String sql = "SELECT * FROM estudiante_apoderado WHERE apoderado_id=? and estudiante_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, apoderado_id);
            ps.setString(2, estudiante_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                es_ap.setIdApoderado(rs.getString("apoderado_id"));
                es_ap.setIdEstudiante(rs.getString("estudiante_id"));
                es_ap.setNombreApoderado(buscarNombreApoderado(es_ap.getIdApoderado(), es_ap.getIdEstudiante()));
                es_ap.setNombreEstudiante(buscarNombreEstudiante(es_ap.getIdApoderado(), es_ap.getIdEstudiante()));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return es_ap;
    }

    public String buscarNombreEstudiante(String apoderado_id, String estudiante_id) {
        Estudiante es = new Estudiante();
        String sql = "SELECT nombre, apellido FROM estudiante e, estudiante_apoderado ea WHERE e.estudiante_id = ea.estudiante_id and ea.estudiante_id = ? and ea.apoderado_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
            ps.setString(2, apoderado_id);
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

    public String buscarNombreApoderado(String apoderado_id, String estudiante_id) {
        Apoderado ap = new Apoderado();
        String sql = "SELECT nombre, apellido FROM apoderado a, estudiante_apoderado ea WHERE a.apoderado_id = ea.apoderado_id and ea.estudiante_id = ? and ea.apoderado_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
            ps.setString(2, apoderado_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                ap.setNombre(rs.getString("nombre"));
                ap.setApellido(rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ap.getNombre() + " " + ap.getApellido();
    }

}
