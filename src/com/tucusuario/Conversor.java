package src.com.tucusuario;

public class Conversor {package com.tucusuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Conversor {
        private List<Moneda> monedas;
        private ConversorAPI api;

        public Conversor() {
            this.monedas = new ArrayList<>();
            this.api = new ConversorAPI();
            cargarMonedasIniciales();  // Monedas por defecto
        }

        private void cargarMonedasIniciales() {
            monedas.add(new Moneda("ARS", "Peso argentino"));
            monedas.add(new Moneda("USD", "Dólar estadounidense"));
            monedas.add(new Moneda("EUR", "Euro"));
            monedas.add(new Moneda("BRL", "Real brasileño"));
        }

        public List<Moneda> getMonedas() {
            return monedas;
        }

        public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
            return api.convertirMoneda(monedaOrigen, monedaDestino, cantidad);
        }
    }
}
