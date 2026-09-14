package br.edu.unicesumar;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, String cv){
        this.modelo=modelo;
        this.motor = new Motor(cv);
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

}
