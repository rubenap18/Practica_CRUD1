package com.ruben.crud;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PantallaPrincipalGUI{
    public PantallaPrincipalGUI() {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
            System.out.println("No existe Clase Look and Feel");
        }

        SwingUtilities.invokeLater(() -> {

            JFrame ventanaP = new JFrame();

            ventanaP.setBounds(0, 0, 800, 800);
            ventanaP.setResizable(false);
            ventanaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaP.setTitle("Informacion Alumno");
            ventanaP.setLocationRelativeTo(null);

            ventanaP.add(new PanelPrincipalGUI());

            ventanaP.setVisible(true);
        });

    }
}