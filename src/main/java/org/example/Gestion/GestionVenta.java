package org.example.Gestion;

import org.example.DTO.*;
import org.example.Util.FechaHoraUtil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestionVenta {

    private List<Venta> ventas = new ArrayList<Venta>();

    public static final int MaxBoletasPorComprador = 10;

    public GestionVenta(){
        ventas = new ArrayList<>();
    }

    public boolean registrarVenta(Evento evento, Localidad localidad, Comprador comprador, int cantidad, TipoPago tipoPago) {
        if(cantidad <=0){
            return false;
        }
        int totalActual = totalPorPersona(evento,comprador.getIdentificacion());
        if(totalActual+cantidad > MaxBoletasPorComprador){
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
    private int totalPorPersona(Evento evento, String identificacion){
        int total = 0;
        for(Venta venta : ventas){
            if(venta.getEvento().equals(evento) && venta.getComprador().getIdentificacion().equals(identificacion)){
                total+=venta.getCantidad();
            }
        }
        return total;
    }
    public List<Venta> getVentas(){
        return ventas;
    }
}
