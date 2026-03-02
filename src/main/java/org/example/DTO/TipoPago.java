package org.example.DTO;

public class TipoPago {

    private String tipo;

    public static final String CREDITO = "CREDITO";
    public static final String DEBITO = "DEBITO";
    public static final String PSE = "PSE";

    public TipoPago(String tipo) {
        if(tipo.equals(CREDITO)||tipo.equals(DEBITO)||tipo.equals(PSE)){
            this.tipo = tipo;
        } else{
            throw new IllegalArgumentException("Tipo de pago no valido"); //lanzar un error para avisar que el argumento no es valido
        }
    }
}
