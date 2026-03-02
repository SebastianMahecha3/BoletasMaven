package org.example.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Localidad {
    private String nombre;
    private double precio;
    private int capacidad;
    private int boletasDisponibles;

    public Localidad(String nombre, double precio, int capacidad, int boletasDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.boletasDisponibles = boletasDisponibles;
    }

    public boolean venderBoletas(int cantidad){
        if(cantidad<= boletasDisponibles){
            boletasDisponibles-=cantidad;
            return true;
        }
        return false;
    }

    public String toString(){
        return nombre+" ($"+precio+") - Disponibles: "+boletasDisponibles+"\n";
    }
}
