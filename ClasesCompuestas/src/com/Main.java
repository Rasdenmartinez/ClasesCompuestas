package com;

public class Main {
    public static void main(String[] args) {
        Llanta llanta = new Llanta("michelin", "16", "Alta", "Todo terreno");
        Estereo estereo1 = new Estereo("Sony", "10x10", "1000");
        Motor motor1 = new Motor("Toyota", "120", "LnSERIE3241");
        Automovil auto1 = new Automovil(llanta, estereo1, motor1);
        auto1.encender();
    }
}
