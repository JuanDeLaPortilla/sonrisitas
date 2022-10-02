package DAO;

import Modelo.Asignatura;
import Modelo.Seccion;
import Modelo.SeccionAsignatura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDseccion_asignatura {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarSeccionAsignatura(SeccionAsignatura sc_as) {
        String sql = "INSERT INTO seccion_asignatura (seccion_id,asignatura_id)VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sc_as.getSeccionID());
            ps.setString(2, sc_as.getAsignaturaID());
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

    public List ListarSeccionAsignatura() {
        List<SeccionAsignatura> ListaScAs = new ArrayList();
        String sql = "SELECT * FROM seccion_asignatura";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SeccionAsignatura sc_as = new SeccionAsignatura();
                sc_as.setSeccionID(rs.getString("seccion_id"));
                sc_as.setAsignaturaID(rs.getString("asignatura_id"));
                ListaScAs.add(sc_as);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaScAs;

    }

    public boolean EliminarSeccionAsignatura(String seccion_id, String asignatura_id) {
        String sql = "DELETE FROM seccion_asignatura WHERE seccion_id = ? and asignatura_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
            ps.setString(2, asignatura_id);
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

    public boolean ModificarSeccionAsignatura(SeccionAsignatura sc_as, String idAsignatura) {
        String sql = "UPDATE seccion_asignatura SET asignatura_id = ? WHERE seccion_id = ? and asignatura_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idAsignatura);
            ps.setString(2, sc_as.getSeccionID());
            ps.setString(3, sc_as.getAsignaturaID());
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

    public SeccionAsignatura BuscarSeccionAsignatura(String seccion_id, String asignatura_id) {
        SeccionAsignatura sc_as = new SeccionAsignatura();
        String sql = "SELECT * FROM seccion_asignatura WHERE seccion_id=? and asignatura_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, seccion_id);
            ps.setString(2, asignatura_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                sc_as.setSeccionID(rs.getString("seccion_id"));
                sc_as.setAsignaturaID(rs.getString("asignatura_id"));
                sc_as.setNombreSeccion(buscarNombreSeccion(sc_as.getSeccionID(), sc_as.getAsignaturaID()));
                sc_as.setNombreAsignatura(buscarNombreAsignatura(sc_as.getSeccionID(), sc_as.getAsignaturaID()));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return sc_as;
    }

    public String buscarNombreAsignatura(String seccion_id, String asignatura_id) {
        Asignatura as = new Asignatura();
        String sql = "SELECT nombre_asignatura FROM asignatura a, seccion_asignatura s WHERE a.asignatura_id = s.asignatura_id and s.asignatura_id = ? and s.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, asignatura_id);
            ps.setString(2, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                as.setNombre(rs.getString("nombre_asignatura"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return as.getNombre();
    }

    public String buscarNombreSeccion(String seccion_id, String asignatura_id) {
        Seccion sc = new Seccion();
        String sql = "SELECT nombre_seccion FROM seccion sc, seccion_asignatura s WHERE sc.seccion_id = s.seccion_id and s.asignatura_id = ? and s.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, asignatura_id);
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

    public String buscarHorarioAsignatura(String seccion_id, String asignatura_id) {
        Asignatura as = new Asignatura();
        String sql = "SELECT horario FROM asignatura a, seccion_asignatura s WHERE a.asignatura_id = s.asignatura_id and s.asignatura_id = ? and s.seccion_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, asignatura_id);
            ps.setString(2, seccion_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                as.setHorario(rs.getString("horario"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return as.getHorario();
    }
}
