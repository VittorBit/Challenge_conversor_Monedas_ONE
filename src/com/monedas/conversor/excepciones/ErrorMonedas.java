
package com.monedas.conversor.excepciones;

import java.lang.RuntimeException;

public class ErrorMonedas extends RuntimeException  {

    private String mensaje;

    public ErrorMonedas(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje="Ocurrio un error";
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }

}