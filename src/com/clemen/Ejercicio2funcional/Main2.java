package com.clemen.Ejercicio2funcional;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author Clemente Quintana
 */
public class Main2 {
    public static void main(String[] args) {
        // Ejercicio 2 Programacion Funcional
        /*
        Dada una lista de productos(carrito de la compra), se pide:
            * Calcular el coste total de la compra, incluyendo impuestos.
            * Listar todos los productos que empiezan por "C" de manera ordenada
                    en una lista separada por comas.
        */
        // SuperReducido 4 %, Reducido 10 %, Normal 21%

        List<Product> shoppingCart = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL)
        );

        //Coste total de la compra con impuestos
        BigDecimal totalCost = shoppingCart
                .stream()
                .map(p -> p.getPrecio().multiply(new BigDecimal("1").add(p.getTax().getInteres())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Coste total de la compra con impuestos: " + totalCost + " €");


        //Listado de productos que empiezan por "C" de manera ordenada en una lista separada por comas
        List<Product> productsStartWithC = shoppingCart.stream()
                .filter(p -> p.getNombre().startsWith("C"))
                .sorted()
                .toList();
        System.out.println("Listado de productos que empiezan por C: " + productsStartWithC);


        //Listado de productos que empiezan por "C" de manera ordenada
        // en una lista separada por comas sin usar el toString
        shoppingCart.stream()
                .filter(p -> p.getNombre().startsWith("C"))
                .sorted()
                .forEach(p -> System.out.print(p.getNombre() + ", "));
    }
}