package com.monedas.conversor.principal;

import com.monedas.conversor.modelos.CotizacionActual;
import com.monedas.conversor.modelos.Moneda;

import java.util.*;

public class PruebaDeListas {

    public static void main(String[] args) {

        Moneda ok = new Moneda("67", "70", 90);
        var estadosUnidos = new CotizacionActual("5.6", "6.5", 5.0, 4.6);
        List<Moneda> lista = new LinkedList<>();
        lista.add(estadosUnidos);
        lista.add(ok);

        lista.sort(Comparator.comparing(Moneda::getMontoBase));
        System.out.println("La cotizacion de los monto base es: " + ok);
    }
}