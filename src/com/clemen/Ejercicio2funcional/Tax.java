package com.clemen.Ejercicio2funcional;

import java.math.BigDecimal;

public enum Tax {
    SUPERREDUCED(new BigDecimal("0.04")),
    REDUCED(new BigDecimal("0.10")),
    NORMAL(new BigDecimal("0.21"));

    private BigDecimal interes;

    Tax(BigDecimal interes) {
        this.interes = interes;
    }

    public BigDecimal getInteres() {
        return interes;
    }
}

