package org.example.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Evento {

    public static final int Max_boletas = 10000; //para poner el maximo de boletas y que este no pueda ser cambiado

    private String nombre;
    private String empresaPatrocinadora;
    private LocalDate fecha;
    private LocalTime hora;
    private List<Localidad> localidades;
    private int totalBoletas;

    public Evento(String nombre, String empresaPatrocinadora, LocalDate fecha, LocalTime hora) //constructor para que sea obligatorio dar estos datos
    {
        this.nombre = nombre;
        this.empresaPatrocinadora = empresaPatrocinadora;
        this.fecha = fecha;
        this.hora = hora;
        this.totalBoletas = 0;
        this.localidades = new ArrayList<>();
    }


}
