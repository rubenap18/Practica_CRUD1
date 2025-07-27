package com.ruben.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ProductoDAO {
    private Connection connection;
    
    public ProductoDAO(Connection connection) {
        this.connection = connection;
    }
    /*public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:/home/rubencin/PracticasJava/practica-enum/src/main/java/com/ruben/practicaenum/base.db");
            System.out.println("Conexion establecida");
        } catch (SQLException e) {
            System.out.println("Error de conexion" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }*/

    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO productos (id, nombreProducto, precio) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, producto.getID());
            preparedStatement.setString(2, producto.getNombreProducto());
            preparedStatement.setDouble(3, producto.getPrecio());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /*public void cerrar() {
        try {
            if (conexion != null) conexion.close();
            System.out.println("Conexion cerrada");
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexion");
        }
    }*/
}
