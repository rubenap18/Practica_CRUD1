package com.ruben.crud;

import java.awt.*;

import javax.swing.JPanel;

public class PanelPrincipalGUI extends JPanel{
    public PanelPrincipalGUI() {
        setLayout(new BorderLayout());
        add(new PanelOpcioneGUI(this),BorderLayout.NORTH);
    }

    public void setPanelCentral(JPanel nuevoPanel) {
        removeAll();

        add(new PanelOpcioneGUI(this),BorderLayout.NORTH);
        add(nuevoPanel, BorderLayout.CENTER);
        revalidate();
        repaint();

    }
    
}
