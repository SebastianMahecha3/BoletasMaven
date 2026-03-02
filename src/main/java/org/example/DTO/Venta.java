package org.example.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venta {
    private Evento evento;
    private Localidad localidad;
    private Comprador comprador;
    private int cantidad;
    private LocalDateTime fechaVenta;
    private TipoPago tipoPago;

    public Venta(Evento evento, Localidad localidad, Comprador comprador, int cantidad, LocalDateTime fechaVenta, TipoPago tipoPago) {
        this.evento = evento;
        this.localidad = localidad;
        this.comprador = comprador;
        this.cantidad = cantidad;
        this.fechaVenta = LocalDateTime.now();
        this.tipoPago = tipoPago;
    }
}
