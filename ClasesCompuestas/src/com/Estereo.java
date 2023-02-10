package com;

public class Estereo {
    String marca;
    String tamaño;
    String potencia;

    public Estereo() {
    }

    public Estereo(String marca, String tamaño, String potencia) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
