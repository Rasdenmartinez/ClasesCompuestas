package com;

public class Llanta {
    String Marca;
    String rodada;
    String calidad;
    String Proposito;

    public Llanta() {
    }

    public Llanta(String marca, String rodada, String calidad, String proposito) {
        Marca = marca;
        this.rodada = rodada;
        this.calidad = calidad;
        Proposito = proposito;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getProposito() {
        return Proposito;
    }

    public void setProposito(String proposito) {
        Proposito = proposito;
    }
}
