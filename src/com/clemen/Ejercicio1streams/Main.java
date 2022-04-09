package com.clemen.Ejercicio1streams;


import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;


/**
 * @author Clemente Quintana
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("##############################################");
        System.out.println("Con Interfaz");
        // Anotacion para declarar la interface
        @FunctionalInterface
        interface Operacion {
            // el metodo abstracto
            public double suma(double x, double y);
        }
        // Expresion lambda
        Operacion operacion  = (x, y) -> x + y;
        System.out.println(operacion.suma(8, 30));



        System.out.println("##############################################");
        System.out.println("            Declarativa");
        System.out.println("##############################################");
        List<Integer> numeros = List.of(2,14,15,2,8,69,2,6,4,7,25,36,14,1,15,2,3,5,4,6);
        int contador = 0;
        for (int numero: numeros) {
            if(numero > 10){
                contador ++;
            }
        }
        System.out.println(contador);
        System.out.println("###############################################");
        System.out.println("            Imperativa");
        System.out.println("###############################################");
        Long resultado = numeros
                .stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(resultado);



        System.out.println("###############################################");
        System.out.println("            Imperativa sin repeticion");
        System.out.println("###############################################");
        Long resultado2 = numeros
                .stream()
                .distinct()
                .filter(n -> n > 10)
                .count();
        System.out.println(resultado2);


        System.out.println("###############################################");
        System.out.println("            Imprimir Lista");

        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .forEach(System.out::println);


        System.out.println("########################################################################");
        System.out.println(" Imprimir Lista Integers parseados a String con Map mostrando el tipo");
        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .map(e->"Number: " + String.valueOf(e))
                        .forEach(n -> System.out.println(n + " como " + n.getClass().getName()));


        System.out.println("###############################################");
        System.out.println("Mas simple aun ...... stream.of()");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .forEach(System.out::println);


        System.out.println("###############################################");
        System.out.println("Parsenado String a Integer");
        Arrays.asList("1","2","3","4","5","5","6","7","8","9","10")
                .stream()
                .map(e->"Number: " + Integer.parseInt(e))
                .distinct()
                .forEach(System.out::println);

        System.out.println("###############################################");
        System.out.println("Parsenado String a Integer con repetidos");
        Arrays.asList("1","2","3","4","5","5","6","7","8","9","10")
                .stream()
                .map(e->"Number: " + Integer.parseInt(e))
                .forEach(System.out::println);
    }
}
