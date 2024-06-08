package com.monedas.conversor.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.monedas.conversor.excepciones.ErrorMonedas;
import com.monedas.conversor.modelos.Moneda;
import com.monedas.conversor.modelos.Cotizacion0mbd;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class PruebaDeBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {

        List<Moneda> listaDivisas = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String direccion = ("https://v6.exchangerate-api.com/v6/3d45b828bae7a714378ba463/latest/" + "USD");

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Cotizacion0mbd miListadoMonedas = gson.fromJson(json, Cotizacion0mbd.class);
            System.out.println("Muestra" + miListadoMonedas);

            Moneda divisaDeMonedas = new Moneda(miListadoMonedas);
            System.out.println("Lista de las monedas ha convertir: " + divisaDeMonedas);

            listaDivisas.add(divisaDeMonedas);
        } catch (ErrorMonedas e) {
            System.out.println(e.getMensaje());
        }
        System.out.println(listaDivisas);
    }
}
