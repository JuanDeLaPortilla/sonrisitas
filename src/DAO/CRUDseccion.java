package DAO;

import Modelo.Profesor;
import Modelo.Seccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDseccion {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarSeccion(Seccion sc) {
        String sql = "INSERT INTO seccion (seccion_id,profesor_id,nombre_seccion)VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sc.getSeccionID());
            ps.setString(2, sc.getProfesorID());
            ps.setString(3, sc.getNombre());
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

    public List ListarSeccion() {
        List<Seccion> ListaSc = new ArrayList();
        String sql = "SELECT * FROM seccion";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Seccion sc = new Seccion();
                sc.setSeccionID(rs.getString("seccion_id"));
                sc.setProfesorID(rs.getString("profesor_id"));
                sc.setNombre(rs.getString("nombre_seccion"));
                ListaSc.add(sc);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaSc;

    }

    public boolean EliminarSeccion(String seccion_id) {
        String sql = "DELETE FROM seccion WHERE seccion_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
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

    public boolean ModificarSeccion(Seccion sc) {
        String sql = "UPDATE seccion SET profesor_id=?,nombre_seccion=? WHERE seccion_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sc.getProfesorID());
            ps.setString(2, sc.getNombre());
            ps.setString(3, sc.getSeccionID());
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

    public Seccion BuscarSeccion(String seccion_id) {
        Seccion sc = new Seccion();
        String sql = "SELECT * FROM seccion WHERE seccion_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                sc.setSeccionID(rs.getString("seccion_id"));
                sc.setProfesorID(rs.getString("profesor_id"));
                sc.setNombre(rs.getString("nombre_seccion"));
                sc.setNombreProfesor(buscarNombreProfesor(sc.getProfesorID(), sc.getSeccionID()));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sc;
    }

    public String buscarNombreProfesor(String profesor_id, String seccion_id) {
        Profesor pf = new Profesor();
        String sql = "SELECT nombre, apellido FROM profesor p, seccion s WHERE p.profesor_id = s.profesor_id and s.profesor_id = ? and s.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, profesor_id);
            ps.setString(2, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pf.setNombre(rs.getString("nombre"));
                pf.setApellido(rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pf.getNombre() + " " + pf.getApellido();
    }

    public String buscarIdSeccion(String nombreSeccion) {
        Seccion sc = new Seccion();
        String sql = "SELECT seccion_id FROM seccion WHERE nombre_seccion = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreSeccion);
            rs = ps.executeQuery();
            if (rs.next()) {
                sc.setSeccionID(rs.getString("seccion_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sc.getSeccionID();
    }
}
