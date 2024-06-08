
package com.monedas.conversor.modelos;

public class Moneda {

    private String montoBase;
    private String montoFinal;
    private double convertirMonto;

    public Moneda(String montoBase,String montoFinal, double convertirMonto) {

        this.montoBase = montoBase;
        this.montoFinal = montoFinal;
        this.convertirMonto = convertirMonto;

    }

    public Moneda(Cotizacion0mbd miListadoMonedas) {
        this.montoBase = miListadoMonedas.base_code();
    }

    /*public void mostrarFichaDeMoneda(){
        System.out.println("El monto de la moneda base es: " + montoBase);
        System.out.println("El monto de la moneda para cambio es:" + montoFinal);
        System.out.println("Convertimos el monto de la moneda: " + convertirMonto);

    }**/

    public String getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(String montoBase) {
        this.montoBase = montoBase;
    }

    public String getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(String montoFinal) {
        this.montoFinal = montoFinal;
    }

    public double getConvertirMonto() {
        return convertirMonto;
    }

    public void setConvertirMonto(double convertirMonto) {
        this.convertirMonto = convertirMonto;
    }

    @Override
    public String toString() {
        return "Conversor de Monedas{" +
                "montoBase='" + montoBase + '\'' +
                ", montoFinal='" + montoFinal + '\'' +
                ", convertirMonto=" + convertirMonto +
                '}';
    }
}
