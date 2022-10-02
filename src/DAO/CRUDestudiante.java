package DAO;

import Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class CRUDestudiante {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarEstudiante(Estudiante es) {
        String sql = "INSERT INTO estudiante (estudiante_id,nombre,apellido,edad,dni,direccion)VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, es.getEstudianteID());
            ps.setString(2, es.getNombre());
            ps.setString(3, es.getApellido());
            ps.setInt(4, es.getEdad());
            ps.setInt(5, es.getDni());
            ps.setString(6, es.getDireccion());
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

    public List ListarEstudiante() {
        List<Estudiante> ListaEs = new ArrayList();
        String sql = "SELECT * FROM estudiante";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Estudiante es = new Estudiante();
                es.setEstudianteID(rs.getString("estudiante_id"));
                es.setNombre(rs.getString("nombre"));
                es.setApellido(rs.getString("apellido"));
                es.setEdad(rs.getInt("edad"));
                es.setDni(rs.getInt("dni"));
                es.setDireccion(rs.getString("direccion"));
                ListaEs.add(es);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaEs;

    }

    public boolean EliminarEstudiante(String estudiante_id) {
        String sql = "DELETE e.*, ea.*, es.* "
                + "FROM estudiante e "
                + "LEFT JOIN estudiante_apoderado ea "
                + "ON e.estudiante_id  = ea.estudiante_id "
                + "LEFT JOIN estudiante_seccion es "
                + "ON e.estudiante_id = es.estudiante_id "
                + "WHERE e.estudiante_id = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
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

    public boolean ModificarEstudiante(Estudiante es) {
        String sql = "UPDATE estudiante SET nombre=?,apellido=?,edad=?,dni=?,direccion=? WHERE estudiante_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, es.getNombre());
            ps.setString(2, es.getApellido());
            ps.setInt(3, es.getEdad());
            ps.setInt(4, es.getDni());
            ps.setString(5, es.getDireccion());
            ps.setString(6, es.getEstudianteID());
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

    public Estudiante BuscarEstudiante(String estudiante_id) {
        Estudiante es = new Estudiante();
        String sql = "SELECT * FROM estudiante WHERE estudiante_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                es.setEstudianteID(rs.getString("estudiante_id"));
                es.setNombre(rs.getString("nombre"));
                es.setApellido(rs.getString("apellido"));
                es.setEdad(rs.getInt("edad"));
                es.setDni(rs.getInt("dni"));
                es.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return es;
    }
}
