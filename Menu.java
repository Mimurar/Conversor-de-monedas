public class Menu {package com.tucusuario;

import java.util.List;
import java.util.Scanner;

    public class Menu {
        private Scanner scanner;
        private Conversor conversor;

        public Menu() {
            this.scanner = new Scanner(System.in);
            this.conversor = new Conversor();
        }

        public void mostrarMenu() {
            System.out.println("\n💱 CONVERSOR DE MONEDAS 💱");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Ver monedas disponibles");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
        }

        public void manejarOpcion(int opcion) {
            switch (opcion) {
                case 1:
                    convertirMoneda();
                    break;
                case 2:
                    mostrarMonedasDisponibles();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el conversor! 👋");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
            }
        }

        private void convertirMoneda() {
            System.out.println("\n🔁 CONVERSIÓN DE MONEDA");
            mostrarMonedasDisponibles();

            System.out.print("Moneda de origen (ej. USD): ");
            String origen = scanner.next().toUpperCase();

            System.out.print("Moneda de destino (ej. EUR): ");
            String destino = scanner.next().toUpperCase();

            System.out.print("Cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            double resultado = conversor.convertir(origen, destino, cantidad);

            if (resultado != -1) {
                System.out.printf("✅ %.2f %s = %.2f %s\n", cantidad, origen, resultado, destino);
            } else {
                System.out.println("❌ Error en la conversión. Verifica las monedas.");
            }
        }

        private void mostrarMonedasDisponibles() {
            System.out.println("\n📋 MONEDAS DISPONIBLES:");
            for (Moneda moneda : conversor.getMonedas()) {
                System.out.println("- " + moneda);
            }
        }
    }
}
