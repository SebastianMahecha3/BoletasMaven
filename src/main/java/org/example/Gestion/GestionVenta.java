package org.example.Gestion;

import org.example.DTO.*;
import org.example.Util.FechaHoraUtil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestionVenta {

    private List<Venta> ventas = new ArrayList<Venta>();

    public static final int MaxBoletasPorComprador = 10;

    public boolean registrarVenta(Evento evento, Localidad localidad, Comprador comprador, int cantidad, TipoPago tipoPago) {
        if(cantidad > MaxBoletasPorComprador){
            return false;
        }
        if(!FechaHoraUtil.ventaPermitida(evento)){
            return false;
        }
        if(!localidad.venderBoletas(cantidad)){
            return false;
        }
        Venta venta = new Venta(evento,localidad,comprador,cantidad, LocalDateTime.now(),tipoPago);
        ventas.add(venta);
        return true;
    }
}
