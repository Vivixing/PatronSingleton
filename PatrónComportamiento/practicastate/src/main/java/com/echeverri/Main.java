package com.echeverri;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        System.out.println("Estado inicial: ");
        System.out.println("Activar: " + user.Activate());
        System.out.println("Comprar: " + user.Buy());
        System.out.println("Bloquear: " + user.lock());
        System.out.println("Desactivar: " + user.Disable());

        System.out.println("\nDespués de algunas acciones: ");
        System.out.println("Activar: " + user.Activate());
        System.out.println("Comprar: " + user.Buy());
        System.out.println("Bloquear: " + user.lock());
        System.out.println("Desactivar: " + user.Disable());
    }
}
