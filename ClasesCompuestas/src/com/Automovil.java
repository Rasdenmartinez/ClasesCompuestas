package com;

public class Automovil {
    Llanta llantas;
    Estereo estero;
    Motor motor;

    public Automovil() {
    }

    public Automovil(Llanta llantas, Estereo estero, Motor motor) {
        this.llantas = llantas;
        this.estero = estero;
        this.motor = motor;
    }
    void encender(){
        motor.encender();
    }

    public Llanta getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Estereo getEstero() {
        return estero;
    }

    public void setEstero(Estereo estero) {
        this.estero = estero;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
