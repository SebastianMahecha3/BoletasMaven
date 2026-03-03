package org.example.Ventana;

import org.example.Gestion.GestionEvento;
import org.example.Gestion.GestionVenta;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private GestionEvento gestionEvento;
    private GestionVenta gestionVenta;

    public VentanaPrincipal() {

        gestionEvento = new GestionEvento();
        gestionVenta = new GestionVenta();


        setTitle("Venta de Boletas");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1,20,20));
        panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
        panel.setBackground(new Color(45, 45, 45));

        JButton registrar = new JButton("Registrar Evento");
        JButton eventos = new JButton("Ver Eventos");

        ponerLindoBoton(registrar);
        ponerLindoBoton(eventos);

        registrar.addActionListener(e ->
            new VentanaRegistrarEvento(gestionEvento).setVisible(true));
        eventos.addActionListener(l ->
            new VentanaEventos(gestionEvento, gestionVenta).setVisible(true));

        panel.add(registrar);
        panel.add(eventos);

        add(panel);

    }
    private void ponerLindoBoton(JButton boton){
        boton.setFocusPainted(false);
        boton.setBackground(new Color(0, 123, 255));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
    }

}
