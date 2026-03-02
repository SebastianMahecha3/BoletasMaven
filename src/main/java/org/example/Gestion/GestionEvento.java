package org.example.Gestion;

import org.example.DTO.Evento;

import java.util.ArrayList;
import java.util.List;

public class GestionEvento {
    private List<Evento> eventos = new ArrayList<>();

    public void registrarEvento(Evento evento){
        eventos.add(evento);
    }

    public List<Evento> listarEventos(){
        return eventos;
    }
}
