package DAO;

import Modelo.Admin;
import Modelo.Apoderado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Admin adminLog(String correo, String pass) {
        Admin admin = new Admin();
        String sql = "SELECT * FROM admin WHERE correo = ? AND  admin_password = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            ps.executeQuery();
            rs = ps.executeQuery();
            if (rs.next()) {
                admin.setAdminID(rs.getString("admin_id"));
                admin.setCorreo(rs.getString("correo"));
                admin.setPass(rs.getString("admin_password"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return admin;
    }

    public Apoderado apoderadoLog(String correo, String pass) {
        Apoderado apoderado = new Apoderado();
        String sql = "SELECT * FROM apoderado WHERE correo = ? AND pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            ps.executeQuery();
            rs = ps.executeQuery();
            if (rs.next()) {
                apoderado.setApoderadoID(rs.getString("apoderado_id"));
                apoderado.setNombre(rs.getString("nombre"));
                apoderado.setApellido(rs.getString("apellido"));
                apoderado.setEdad(rs.getInt("edad"));
                apoderado.setDni(rs.getInt("dni"));
                apoderado.setDireccion(rs.getString("direccion"));
                apoderado.setContraseña(rs.getString("pass"));
                apoderado.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return apoderado;
    }
}
