package src.com.tucusuario;

package com.tucusuario;

public class Moneda {
    private String codigo;  // Ej: "USD"
    private String nombre;  // Ej: "Dólar estadounidense"

    // Constructor
    public Moneda(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return codigo + ": " + nombre;  // Ej: "USD: Dólar estadounidense"
    }
}