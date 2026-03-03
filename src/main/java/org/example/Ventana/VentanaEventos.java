package org.example.Ventana;

import org.example.DTO.Evento;
import org.example.Gestion.GestionEvento;
import org.example.Gestion.GestionVenta;

import javax.swing.*;
import java.awt.*;

public class VentanaEventos extends JFrame {

    public VentanaEventos(GestionEvento gestionEvento, GestionVenta gestionVenta) {

        setTitle("Eventos disponibles");
        setSize(500,400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JList<Evento> listaEventos = new JList<Evento>(
                gestionEvento.listarEventos().toArray(new Evento[0])
        );

        JScrollPane scroll = new JScrollPane(listaEventos);

        JButton Comprar = new JButton("Comprar Boletas");
        Comprar.setBackground(new Color(40,167,69));
        Comprar.setForeground(Color.white);

        Comprar.addActionListener(e -> {
            Evento sel = listaEventos.getSelectedValue();
            if (sel != null) {
                //new VentanaCompra(sel,gestionVenta).setVisible(true);
            }
        });

        panel.add(scroll, BorderLayout.CENTER);
        panel.add(Comprar, BorderLayout.SOUTH);

        add(panel);


    }
}
