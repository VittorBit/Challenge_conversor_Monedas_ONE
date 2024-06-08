
package com.monedas.conversor.principal;

import com.google.gson.Gson;
import com.monedas.conversor.excepciones.ErrorMonedas;
import com.monedas.conversor.modelos.MonedasDatos;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public MonedasDatos buscadorCotizacion(String busquedaDenominacion) {

        String direccion = ("https://v6.exchangerate-api.com/v6/3d45b828bae7a714378ba463/latest/" + busquedaDenominacion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedasDatos.class);
        } catch (Exception e) {
            throw new ErrorMonedas("Ocurrio un error en la conversion.");
        }
    }
}

