package com.ruben.crud;

public class Producto {
    private String nombreProducto;
    private double precio;
    private int id;

    public Producto(int id, String nombreProducto, double precio) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getID() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }
}
