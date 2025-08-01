package com.ruben.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDAO {
    private Connection connection;
    
    public ProductoDAO(Connection connection) {
        this.connection = connection;
    }

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

    public void eliminarProducto(Producto producto) {
        String sql = "DELETE FROM productos WHERE id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(  1, producto.getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
