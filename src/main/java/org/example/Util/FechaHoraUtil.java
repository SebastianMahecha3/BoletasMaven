package org.example.Util;

import org.example.DTO.Evento;

import java.time.LocalDateTime;

public class FechaHoraUtil {

    public static Boolean ventaPermitida(Evento evento){
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime inicio = LocalDateTime.of(evento.getFecha(),evento.getHora());

        return ahora.isBefore(inicio.plusHours(1)); //verifica que la hora actual sea previa a la hora del concierto + 1 hora
    }
}
