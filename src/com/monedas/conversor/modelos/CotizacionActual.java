
package com.monedas.conversor.modelos;

public class CotizacionActual extends Moneda {

    private double montoConvertido;

    public CotizacionActual(String montoBase, String montoFinal, double convertirMonto, double montoConvertido) {

        super(montoBase,montoFinal,convertirMonto);
        this.montoConvertido = montoConvertido;
    }

    public double getMontoConvertido() {
        return montoConvertido;
    }

    public void setMontoConvertido(double montoConvertido) {
        this.montoConvertido = montoConvertido;
    }

    @Override
    public String toString() {
        return "CotizacionActual{" +
                "montoConvertido=" + montoConvertido +
                '}';
    }
}
