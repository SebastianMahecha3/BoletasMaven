package org.example.Ventana;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        setTitle("Venta de Boletas");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(30, 30, 30));

        JLabel titulo = new JLabel("Sistema de Boletas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);



        JButton eventos = new JButton("Ver Eventos");
        eventos.setFocusPainted(false);
        eventos.setBackground(new Color(0, 123, 255));
        eventos.setForeground(Color.WHITE);
        eventos.setFont(new Font("Arial", Font.BOLD, 14));
        eventos.setPreferredSize(new Dimension(200, 40));
        eventos.addActionListener(e -> {
            //new VentanaEventos().setVisible(true);
        }  );

        JPanel centro = new JPanel();
        centro.setBackground(new Color(30, 30, 30));
        centro.add(eventos);

        panel.add(titulo, BorderLayout.NORTH);
        panel.add(centro, BorderLayout.CENTER);

        add(panel);
    }

}
