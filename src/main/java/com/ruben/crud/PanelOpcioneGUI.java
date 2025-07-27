package com.ruben.crud;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelOpcioneGUI extends JPanel {

    private JButton botonCrear, botonConsultar, botonEliminar, botonEditar;

    public PanelOpcioneGUI(PanelPrincipalGUI panelPadre) {
        setLayout(new FlowLayout());

        setBackground(Color.BLACK);

        botonCrear = new JButton("Crear");
        add(botonCrear);

        botonCrear.addActionListener(ee1 -> {
            
                JPanel panel = new JPanel();
                panel.setLayout(null);

                // codigo agregar a panel
                JTextField tfID = new JTextField("ID");
                tfID.setSize(new Dimension(200, 30));
                tfID.setLocation(new Point(10, 10));
                panel.add(tfID);

                JTextField tfNombre = new JTextField("Nombre");
                tfNombre.setSize(new Dimension(200, 30));
                tfNombre.setLocation(new Point(10, 50));
                panel.add(tfNombre);

                JTextField tfPrecio = new JTextField("Precio");
                tfPrecio.setSize(new Dimension(200, 30));
                tfPrecio.setLocation(new Point(10, 90));
                panel.add(tfPrecio);

                JButton botonAgregar = new JButton("Agregar");
                botonAgregar.setBounds(10, 130, 200, 60);
                panel.add(botonAgregar);

                panel.setBackground(Color.WHITE);
                panelPadre.setPanelCentral(panel);
            
                // metodo boton Agregar
                botonAgregar.addActionListener(ee -> {
                    Producto producto = new Producto(Integer.parseInt(tfID.getText()),
                            tfNombre.getText(), Double.parseDouble(tfPrecio.getText()));

                    ProductoController productoController = new ProductoController();
                    if (productoController.agregarProducto(producto)) {
                        System.out.println("Producto agragado exitosamente.");
                    } else {
                        System.out.println("Producto no agregado exitosamente.");
                    }
                });

        });

        botonConsultar = new JButton("Consultar");
        add(botonConsultar);

        botonEliminar = new JButton("Eliminar");
        add(botonEliminar);

        botonEditar = new JButton("Editar");
        add(botonEditar);

    }
}
