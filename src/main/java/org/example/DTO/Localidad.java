package org.example.DTO;

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
}
