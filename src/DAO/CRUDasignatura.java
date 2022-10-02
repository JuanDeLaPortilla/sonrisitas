package DAO;

import Modelo.Asignatura;
import Modelo.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDasignatura {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarAsignatura(Asignatura as) {
        String sql = "INSERT INTO asignatura (asignatura_id,profesor_id,nombre_asignatura,horario)VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, as.getAsignaturaID());
            ps.setString(2, as.getProfesorID());
            ps.setString(3, as.getNombre());
            ps.setString(4, as.getHorario());
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

    public List ListarAsignatura() {
        List<Asignatura> ListaAs = new ArrayList();
        String sql = "SELECT * FROM asignatura";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asignatura as = new Asignatura();
                as.setAsignaturaID(rs.getString("asignatura_id"));
                as.setProfesorID(rs.getString("profesor_id"));
                as.setNombre(rs.getString("nombre_asignatura"));
                as.setHorario(rs.getString("horario"));
                ListaAs.add(as);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaAs;

    }

    public boolean EliminarAsignatura(String asignatura_id) {
        String sql = "DELETE FROM asignatura WHERE asignatura_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, asignatura_id);
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

    public boolean ModificarAsignatura(Asignatura as) {
        String sql = "UPDATE asignatura SET profesor_id=?,nombre_asignatura=?,horario=? WHERE asignatura_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, as.getProfesorID());
            ps.setString(2, as.getNombre());
            ps.setString(3, as.getHorario());
            ps.setString(4, as.getAsignaturaID());
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

    public Asignatura BuscarAsignatura(String asignatura_id) {
        Asignatura as = new Asignatura();
        String sql = "SELECT * FROM asignatura WHERE asignatura_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, asignatura_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                as.setAsignaturaID(rs.getString("asignatura_id"));
                as.setProfesorID(rs.getString("profesor_id"));
                as.setNombre(rs.getString("nombre_asignatura"));
                as.setHorario(rs.getString("horario"));
                as.setNombreProfesor(buscarNombreProfesor(as.getProfesorID(),as.getAsignaturaID()));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return as;
    }

    public String buscarNombreProfesor(String profesor_id, String asignatura_id) {
        Profesor pf = new Profesor();
        String sql = "SELECT nombre, apellido FROM profesor p, asignatura a WHERE p.profesor_id = a.profesor_id and a.profesor_id = ? and a.asignatura_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, profesor_id);
            ps.setString(2, asignatura_id);
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
}
