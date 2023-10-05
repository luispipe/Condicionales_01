package com.example.condicionales;

public class CondicionalSwitch {

    public void pruebaSwitch(){
        /*Una app bancaria que dado la opción que el usuario indique genera una acción
        * 1. llamada de un asesor
        * 2. bloqueo de tarjetas
        * 3. consultar información de productos
        * 4. denunciar una estafa
        * */


        int opcion= 2;
        switch (opcion){
            case 1:
                System.out.println("Selecciono primera opción");
                break;
            case 2:
                System.out.println("Selecciono segunda opción");
                break;
            case 3:
                System.out.println("Selecciono tercera opción");
                break;
            case 4:
                System.out.println("Selecciono cuarta opción");
                break;
            default:
                System.out.println("Selecciono una opción no disponible");
        }


        /*La app obtiene una hora y con base en ella define si es de:
        *
        * mañana 00 - 12
        * tarde  13 - 18
        * noche  19 - 23
        *
        * */

        int hora= 9;

        switch (hora){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Es de mañana");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Es de tarde");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Es de noche");
                break;
            default:
                System.out.println("La hora no existe");
        }
        /* Nos llega el dia se la semana y con base en el decimos el tipo de dia:
        *   1. lunes o 1 --> Inicio de semana;
        *   2. martes,miercoles,jueves o 2,3,4 -->  Mediados de semana
        *   3. viernes o 5 --> Inicio fin de semana
        *   4. sabados, domingo o 6,7 --> Fin de semana
        * */

        String tipoDia;
        String dia="VIERNES";

        switch (dia.toLowerCase()){
            case "lunes":
                tipoDia="Inicio de semana";
                break;
            case "martes": case "miercoles": case "jueves":
                tipoDia="Mediados de semana";
                break;
            case "viernes":
                tipoDia="Inicio fin de semana";
                break;
            case "sabado": case "domingo":
                tipoDia="Fin de semana";
                break;
            default:
                tipoDia="NA";
        }

        System.out.println(dia+" es "+tipoDia);

    }




}
