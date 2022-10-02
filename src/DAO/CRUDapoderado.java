package DAO;

import Modelo.Apoderado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDapoderado {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarApoderado(Apoderado ad) {
        String sql = "INSERT INTO apoderado (apoderado_id,nombre,apellido,edad,dni,direccion,pass,correo)VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getApoderadoID());
            ps.setString(2, ad.getNombre());
            ps.setString(3, ad.getApellido());
            ps.setInt(4, ad.getEdad());
            ps.setInt(5, ad.getDni());
            ps.setString(6, ad.getDireccion());
            ps.setString(7, ad.getContraseña());
            ps.setString(8, ad.getCorreo());
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

    public List ListarApoderado() {
        List<Apoderado> ListaAd = new ArrayList();
        String sql = "SELECT * FROM apoderado";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Apoderado ad = new Apoderado();
                ad.setApoderadoID(rs.getString("apoderado_id"));
                ad.setNombre(rs.getString("nombre"));
                ad.setApellido(rs.getString("apellido"));
                ad.setEdad(rs.getInt("edad"));
                ad.setDni(rs.getInt("dni"));
                ad.setDireccion(rs.getString("direccion"));
                ad.setContraseña(rs.getString("pass"));
                ad.setCorreo(rs.getString("correo"));
                ListaAd.add(ad);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaAd;

    }

    public boolean EliminarApoderado(String apoderado_id) {
        String sql = "DELETE FROM apoderado WHERE apoderado_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, apoderado_id);
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

    public boolean ModificarApoderado(Apoderado ad) {
        String sql = "UPDATE apoderado SET nombre=?,apellido=?,edad=?,dni=?,direccion=?,pass=?,correo=? WHERE apoderado_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getNombre());
            ps.setString(2, ad.getApellido());
            ps.setInt(3, ad.getEdad());
            ps.setInt(4, ad.getDni());
            ps.setString(5, ad.getDireccion());
            ps.setString(6, ad.getContraseña());
            ps.setString(7, ad.getCorreo());
            ps.setString(8, ad.getApoderadoID());
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

    public Apoderado BuscarApoderado(String apoderado_id) {
        Apoderado ad = new Apoderado();
        String sql = "SELECT * FROM apoderado WHERE apoderado_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, apoderado_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                ad.setApoderadoID(rs.getString("apoderado_id"));
                ad.setNombre(rs.getString("nombre"));
                ad.setApellido(rs.getString("apellido"));
                ad.setEdad(rs.getInt("edad"));
                ad.setDni(rs.getInt("dni"));
                ad.setDireccion(rs.getString("direccion"));
                ad.setContraseña(rs.getString("pass"));
                ad.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ad;
    }

    public String buscarIdApoderado(String correo) {
        Apoderado ap = new Apoderado();
        String sql = "SELECT apoderado_id FROM apoderado WHERE correo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            if (rs.next()) {
                ap.setApoderadoID(rs.getString("apoderado_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ap.getApoderadoID();
    }

    public String buscarNombreApoderado(String idApoderado) {
        Apoderado ap = new Apoderado();
        String sql = "SELECT nombre, apellido FROM apoderado WHERE apoderado_id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, idApoderado);
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
