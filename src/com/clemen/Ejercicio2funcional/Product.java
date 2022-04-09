package com.clemen.Ejercicio2funcional;

import java.math.BigDecimal;

public class Product {

    private String nombre;
    private BigDecimal precio;
    private Tax tax;

    // Constructores
    public Product(){};

    public Product(String nombre, BigDecimal precio, Tax tax) {
        this.nombre = nombre;
        this.precio = precio;
        this.tax = tax;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public Tax getTax() {
        return tax;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
