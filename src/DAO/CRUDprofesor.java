package DAO;

import Modelo.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDprofesor {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarProfesor(Profesor pf) {
        String sql = "INSERT INTO profesor (profesor_id,nombre,apellido,edad,dni,direccion)VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pf.getProfesorID());
            ps.setString(2, pf.getNombre());
            ps.setString(3, pf.getApellido());
            ps.setInt(4, pf.getEdad());
            ps.setInt(5, pf.getDni());
            ps.setString(6, pf.getDireccion());
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

    public List ListarProfesor() {
        List<Profesor> ListaPf = new ArrayList();
        String sql = "SELECT * FROM profesor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profesor pf = new Profesor();
                pf.setProfesorID(rs.getString("profesor_id"));
                pf.setNombre(rs.getString("nombre"));
                pf.setApellido(rs.getString("apellido"));
                pf.setEdad(rs.getInt("edad"));
                pf.setDni(rs.getInt("dni"));
                pf.setDireccion(rs.getString("direccion"));
                ListaPf.add(pf);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaPf;

    }

    public boolean EliminarProfesor(String profesor_id) {
        String sql = "DELETE FROM profesor WHERE profesor_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, profesor_id);
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

    public boolean ModificarProfesor(Profesor pf) {
        String sql = "UPDATE profesor SET nombre=?,apellido=?,edad=?,dni=?,direccion=? WHERE profesor_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pf.getNombre());
            ps.setString(2, pf.getApellido());
            ps.setInt(3, pf.getEdad());
            ps.setInt(4, pf.getDni());
            ps.setString(5, pf.getDireccion());
            ps.setString(6, pf.getProfesorID());
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

    public Profesor BuscarProfesor(String profesor_id) {
        Profesor pf = new Profesor();
        String sql = "SELECT * FROM profesor WHERE profesor_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, profesor_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pf.setProfesorID(rs.getString("profesor_id"));
                pf.setNombre(rs.getString("nombre"));
                pf.setApellido(rs.getString("apellido"));
                pf.setEdad(rs.getInt("edad"));
                pf.setDni(rs.getInt("dni"));
                pf.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pf;
    }
}
