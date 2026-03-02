package org.example.DTO;

public class Comprador {

    private String nombre;
    private String identificacion;
    private String correo;
    private String telefono;

    public Comprador(String nombre, String identificacion, String correo, String telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
    }
}
