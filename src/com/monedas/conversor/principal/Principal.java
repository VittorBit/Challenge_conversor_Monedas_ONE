
package com.monedas.conversor.principal;

import com.monedas.conversor.modelos.CotizacionActual;
import com.monedas.conversor.modelos.MonedasDatos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public final String ejemploDeListadoDeMonedas = """
            *EJEMPLOS DE LISTADO DE MONEDAS*
                   *MAS UTILIZADAS*
                               
              USD --- Dólar Estadounidense
              ARS --- Peso Argentino
              BRL --- Real Brasileño
              COP --- Peso Colombiano
              EUR --- Euro""";

    public void mostrarMenu() {
        System.out.println("-------------------------------------------------------------------\n");
        System.out.println("A continuación digíte la opción que desea realizar: \n");
        String menuEleccion = """
                1) Listado de las monedas a cambiar
                2) Hacer una conversión de moneda
                3) Consultar del cambio de monedas
                4) Cerrar""";
        System.out.println(menuEleccion);
    }
    
    public Serializable leerOpcionPrincipal(){

        Scanner lectura = new Scanner(System.in);
        System.out.println("Elija una opción válida \n");
        System.out.println("-------------------------------------------------------------------\n");
        // REDUCIMOS EL CODIGO PARA MAS LEGIBILIDAD //
        // int leerEntero=lectura.nextInt(); //
        /* String leerCaracter;
        boolean verificar=false;
        if(verificar){
            leerCaracter=lectura.nextLine();
        } **/
        try {
            // Funcion en java para la lectura y salida de numeros enteros //
           return lectura.nextInt();
        } catch (Exception e) {
            // Procedemos a imprimir y mostrar el resultado de la opcion ingresada de tipo caracter o String //
            System.out.println("Ocurrio un error solo se admiten numeros y no palabras como:"+"(´"+lectura.nextLine()+"´),"+
                    "\npor favor intente de nuevo.\n");
        }
        // Utilizamos el principio de la "Recursividad directa" en java. //
        return leerOpcionPrincipal();
    }

    public void mostrarMenuMonedas(String denominacion){
        System.out.println("\n-------------------------------------------------------------------\n");
        System.out.println("Seleccione la denominación " + denominacion + ": \n");
        System.out.println(ejemploDeListadoDeMonedas);
        System.out.println("\n-------------------------------------------------------------------\n");
    }

    public String leerOpcionMonto(){
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        Busqueda ListaDeDivisas = new Busqueda();
        MonedasDatos conversorMonedas = ListaDeDivisas.buscadorCotizacion(opcion);
        String convertirATexto= String.valueOf(conversorMonedas);
        while (!convertirATexto.toLowerCase().contains(opcion)) {
            System.out.println("La opción digitada no está disponible");
            System.out.println("Elija una opción válida \n");
            System.out.println("-------------------------------------------------------------------\n");
            opcion = lectura.nextLine().toLowerCase();
        }
        return opcion.toUpperCase();
    }

    public Double leerMontoAConvertir(){
        System.out.println("-------------------------------------------------------------------\n");
        System.out.println("Seleccione la cantidad que desea cambiar: \n");
        System.out.println("-------------------------------------------------------------------\n");
        Scanner lectura = new Scanner(System.in);
        double cantidadConvertir;
        while (!lectura.hasNextDouble()) {
            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("La cantidad digitada no es un número válido");
            System.out.println("Ingrese una cantidad válida");
            System.out.println("\n-------------------------------------------------------------------\n");
            lectura.nextLine();
        }
        cantidadConvertir = lectura.nextDouble();
        lectura.nextLine();
        return cantidadConvertir;
    }

    public Double cantidadObtenida(String montoBase, double convertirMonto, double tasaDeConversion, String montoFinalizado){
        Double resultadoFinal = convertirMonto * tasaDeConversion;
        System.out.println("-------------------------------------------------------------------\n");
        System.out.println("Su cotización de la moneda de "+convertirMonto + " " + montoBase + " equivalen a: " + resultadoFinal
                + " " + montoFinalizado+"\n");
        return resultadoFinal;
    }

    public void imprimirConversiones(ArrayList<CotizacionActual> listaDeConversiones) {
        if (listaDeConversiones.isEmpty()) {
            System.out.println("No se han realizado conversiones. \n");
        } else {
            System.out.println("Historial de cambio de monedas: \n");
            for (int i = 0; i < listaDeConversiones.size(); i++) {
                CotizacionActual conversionMonedas = listaDeConversiones.get(i);
                System.out.println("Conversión de monedas " + (i + 1) + ":");
                System.out.println("Moneda base a convertir: " + conversionMonedas.getMontoBase());
                System.out.println("Moneda objetiva a convetir: " + conversionMonedas.getMontoFinal());
                System.out.println("Cantidad del monto de moneda a cotizar: " + conversionMonedas.getConvertirMonto());
                System.out.println("Cantidad final del monto obtenido: " + conversionMonedas.getMontoConvertido());
                System.out.println("-------------------------------------------------------------------\n");
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        int opcionUsuario = 0;
        Busqueda consulta = new Busqueda();
        ArrayList<CotizacionActual> listadoDeConversiones = new ArrayList<>();
        System.out.println("---------------------------------------------------------------------------\n");
        System.out.println(" │ │ │ LES DAMOS LA BIENVENIDA AL PROGRAMA DE CONVERSIÓN DE MONEDAS │ │ │\n");
        System.out.println("---------------------------------------------------------------------------");
        while (opcionUsuario != 3) {
            Principal menu = new Principal();
            menu.mostrarMenu();
            opcionUsuario = (int) menu.leerOpcionPrincipal();

            switch (opcionUsuario) {
                case 1:
                    ListadoDemonedas ListaDeDivisas = new ListadoDemonedas();
                    System.out.println("\n"+ ListaDeDivisas.ListaDeConversion +"\n");
                    break;
                case 2:
                    menu.mostrarMenuMonedas("inicial");
                    String montoBase = menu.leerOpcionMonto();
                    menu.mostrarMenuMonedas("final");
                    String montoFinalizado = menu.leerOpcionMonto();
                    // Esta parte de la sintaxis del codigo que valida y acepta datos para la conversion de la API
                    // con nuestro programa principal //
                    Double convertirMonto = menu.leerMontoAConvertir();
                    MonedasDatos conversorMonedas = consulta.buscadorCotizacion(montoBase);
                    Double tasaDeConversion = conversorMonedas.getConversionMonedas(montoFinalizado.toUpperCase());
                    Double cantidadObtenida = menu.cantidadObtenida(montoBase, convertirMonto, tasaDeConversion,
                            montoFinalizado);
                    CotizacionActual nuevoMontoDeConversion = new CotizacionActual(montoBase, montoFinalizado,
                            convertirMonto, cantidadObtenida);
                    listadoDeConversiones.add(nuevoMontoDeConversion);
                    break;
                case 3:
                    menu.imprimirConversiones(listadoDeConversiones);
                    break;
                case 4:
                    System.out.println("\nGracias a usted por utilizar nuestro programa de cambio de moneda.");
                    System.out.println("\n-------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ésta es una elección equivocada, por favor seleccione una " +
                            "\nopción del menú. \n");
            }
        }
    }
}
