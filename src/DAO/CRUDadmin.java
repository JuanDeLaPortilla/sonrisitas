package DAO;

import Modelo.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDadmin {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarAdmin(Admin ad) {
        String sql = "INSERT INTO admin (admin_id,admin_password,correo)VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getAdminID());
            ps.setString(2, ad.getPass());
            ps.setString(3, ad.getCorreo());
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

    public List ListarAdmin() {
        List<Admin> ListaAd = new ArrayList();
        String sql = "SELECT * FROM admin";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Admin ad = new Admin();
                ad.setAdminID(rs.getString("admin_id"));
                ad.setPass(rs.getString("admin_password"));
                ad.setCorreo(rs.getString("correo"));
                ListaAd.add(ad);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaAd;

    }

    public boolean EliminarAdmin(String admin_id) {
        String sql = "DELETE FROM admin WHERE admin_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, admin_id);
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

    public boolean ModificarAdmin(Admin ad) {
        String sql = "UPDATE admin SET admin_password=?,correo=? WHERE admin_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getPass());
            ps.setString(2, ad.getCorreo());
            ps.setString(3, ad.getAdminID());
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

    public Admin BuscarAdmin(String admin_id) {
        Admin ad = new Admin();
        String sql = "SELECT * FROM admin WHERE admin_id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, admin_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                ad.setAdminID(rs.getString("admin_id"));
                ad.setPass(rs.getString("admin_password"));
                ad.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ad;
    }
}
