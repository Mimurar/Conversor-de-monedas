package com.tucusuario;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        while (true) {
            menu.mostrarMenu();
            int opcion = new java.util.Scanner(System.in).nextInt();
            menu.manejarOpcion(opcion);
        }
    }
}