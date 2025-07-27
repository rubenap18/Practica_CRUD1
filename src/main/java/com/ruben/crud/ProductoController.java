package com.ruben.crud;

import java.sql.SQLException;

public class ProductoController {
    public boolean agregarProducto(Producto producto) {
        try {
            ProductoDAO productoDAO = new ProductoDAO(DBConnection.getConnection());
            productoDAO.agregarProducto(producto);
            DBConnection.closeConnection();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
