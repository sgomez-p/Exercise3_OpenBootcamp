package com.company;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println("Numero de puertas del coche: " + miCoche.getNumPuertas());
    }
}