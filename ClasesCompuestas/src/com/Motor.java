package com;

public class Motor {
    String marca;
    String potencia;
    String numSerie;

    public Motor() {
    }

    public Motor(String marca, String potencia, String numSerie) {
        this.marca = marca;
        this.potencia = potencia;
        this.numSerie = numSerie;
    }
    void encender(){
        System.out.println("El motor "+marca +" esta encendido");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
}
