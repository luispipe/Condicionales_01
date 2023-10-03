package com.example.condicionales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Condicionales if else if else
        int valor1= 152;
        int valor2= 46;
        int valor3= 307;
        int valor4= 98;

        //El usuario me ingresa un número y debo validar si este es mayor a los 4 valores que tengo
        int valorUsuario=200;

        //Primera solución --> esfuerzo máximo
        if (valorUsuario>valor1){
            if (valorUsuario>valor2){
                if (valorUsuario>valor3){
                    if (valorUsuario>valor4){
                        System.out.println("Es mayor");
                    }else{
                        System.out.println("No es mayor");
                    }
                }else{
                    System.out.println("No es mayor");
                }
            }else{
                System.out.println("No es mayor");
            }
        }else{
            System.out.println("No es mayor");
        }

        //Segunda Solución
        if (valorUsuario<valor1 || valorUsuario<valor2 || valorUsuario<valor3
            || valorUsuario<valor4){
            System.out.println("No es mayor");
        }else{
            System.out.println("Es mayor");
        }

        //Tercera
        if (valorUsuario>valor1 && valorUsuario>valor2 && valorUsuario>valor3
                && valorUsuario>valor4){
            System.out.println("Es mayor");
        }else{
            System.out.println("No es mayor");
        }

        //Cuarta
        if (valorUsuario<valor1){
            System.out.println("No es mayor");
        } else if (valorUsuario<valor2) {
            System.out.println("No es mayor");
        } else if (valorUsuario<valor3) {
            System.out.println("No es mayor");
        } else if (valorUsuario<valor4) {
            System.out.println("No es mayor");
        }else{
            System.out.println("Es mayor");
        }

        //Quinta
        if (valorUsuario>valor1){

        }
        if (valorUsuario>valor2){

        }
        if (valorUsuario>valor3){

        }
        if (valorUsuario>valor4){

        }

        /* Operadores Lógicos
        -Elementos que permiten realizar operaciones dentro de los condicionales
        para hacer comparaciones
        -Cualquier operación dentro de un condicional solo puede tener el valor
            True --> se cumple ó False --> no se cumple

        == -> igualdad, si un valor es igual a otro
        != -> diferente, si un valos es diferente de otro
        >  -> mayor que, si un valor es mayor a otro
        >= -> mayor o igual, si un valor es mayor igual a otro
        <  -> menor que, si un valor es menor a otro
        <= -> menor o igual, si un valor es menor o igual a otro
        !  -> negación, valida que una condición no se cumpla
        || -> conjunción, permite agrupar varias condiciones y validar que
              con que se cumpla una condicion se realiza la acción True
        && -> disyunción, permite agrupar varias condiciones y se deben cumpir todas
        * */

        int bateria= 50;

        if (bateria==100){
            System.out.println("La bateria esta cargada al máximo");
        }

        // bateria es > a 100 o bateria es < que 100
        if (bateria!=100){
            System.out.println("La bateria no esta completamente cargada");
        }
        /*if (bateria>100 || bateria<100){
            System.out.println("La bateria no esta completamente cargada");
        }*/

        //rango comparación va de 51 a 100 de carga
        if (bateria>50){
            System.out.println("La bateria esta en la mitad de carga");
        }
        //rango comparación va de 50 a 100 de carga
        if (bateria>=50){
            System.out.println("La bateria esta en la mitad de carga");
        }
        //rango comparación va de 0 a 49 de carga
        if (bateria<50){
            System.out.println("La bateria esta en menos de la mitad de carga");
        }
        //rango comparación va de 0 a 50 de carga
        if (bateria<=50){
            System.out.println("La bateria esta en menos de la mitad de carga");
        }

        if (bateria>30){
            System.out.println("La bateria esta en más de un 30% de carga");
        }
        if (!(bateria>30)){
            System.out.println("La bateria esta en menos de un 30% de carga");
        }

        //en este caso se valida que la condición sea verdadera
        // quiero saber que "La bateria es igual a 100"
        if (bateria==100){
            System.out.println("La bateria esta cargada");
        }else{
            System.out.println("La bateria no esta cargada");
        }

        //En este caso se valida que la condicón sea falsa
        // quiero saber que "La bateria NO es igual a 100"
        if (!(bateria==100)){
            System.out.println("La bateria no esta cargada");
        }else{
            System.out.println("La bateria esta cargada");
        }

        /* AND (&&) y OR (||) son operaciones de conjuntos

        quiero saber los datos que hay en comun entre 3 conjuntos
        - conjunto1 contiene al usuario1 Y conjunto2 contiene al usuario1 Y conjunto3 tiene al usuario1

        quiero saber si un usuario esta al menos dentro de uno de los 3 conjuntos
        -conjunto1 contiene al usuario1 Ó conjunto2 contiene al usuario1 Ó conjunto3 tiene al usuario1

        * */




    }
}