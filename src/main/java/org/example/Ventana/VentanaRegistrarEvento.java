package org.example.Ventana;

import org.example.DTO.Evento;
import org.example.DTO.Localidad;
import org.example.Gestion.GestionEvento;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class VentanaRegistrarEvento extends JFrame {

    public VentanaRegistrarEvento(GestionEvento gestionEvento) {

        setTitle("Registrar Evento");
        setSize(500, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JTextField nombre = new JTextField();
        JTextField empresa = new JTextField();
        JTextField fecha = new JTextField();
        JTextField hora = new JTextField();

        JButton Crear = new JButton("Crear Evento");
        JButton AgregarLocalidad = new JButton("Agregar Localidad");

        Evento[] eventoActual = new Evento[1];

        Crear.addActionListener(e ->{
            try{
                Evento evento = new Evento(nombre.getText(),empresa.getText(), LocalDate.parse(fecha.getText()), LocalTime.parse(hora.getText()));

                gestionEvento.registrarEvento(evento);
                eventoActual[0]=evento;
                JOptionPane.showMessageDialog(this,"Evento registrado correctamente");
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error en registrar Evento");
            }
        } );
        AgregarLocalidad.addActionListener(e ->{
            if(eventoActual[0]!=null){
                JOptionPane.showMessageDialog(this,"Primero crea el evento");
                return;
            }
            try {
                String nombreLocalidad = JOptionPane.showInputDialog("Ingrese el nombre del Localidad");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
                int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Capacidad: "));

                Localidad localidad = new Localidad(nombreLocalidad,precio,capacidad, capacidad);

                if(eventoActual[0].agregarLocalidad(localidad)){
                    JOptionPane.showMessageDialog(this,"Localidad agregada");
                }else{
                    JOptionPane.showMessageDialog(this,"Se excede el maximo de 10000 boletas");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Datos invalidos");
            }
        });
        panel.add(new JLabel("Nombre Evento:"));
        panel.add(nombre);
        panel.add(new JLabel("Empresa patrocinadora:"));
        panel.add(empresa);
        panel.add(new JLabel("Fecha (YYYY-MM-DD):"));
        panel.add(fecha);
        panel.add(new JLabel("Hora (HH:MM):"));
        panel.add(hora);
        panel.add(Crear);
        panel.add(AgregarLocalidad);

        add(panel);
    }
}
