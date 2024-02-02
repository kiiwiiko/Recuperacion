package com.example.figurasmongo.models;

public abstract class Circulo extends Figura{
    private double xCentro;
    private double yCentro;
    private double xCircunferencia;
    private double yCircunferencia;

    public Circulo(String numeracion, double perimetro, double area, double xCentro, double yCentro, double xCircunferencia, double yCircunferencia) {
        super(numeracion, perimetro, area);
        this.xCentro = xCentro;
        this.yCentro = yCentro;
        this.xCircunferencia = xCircunferencia;
        this.yCircunferencia = yCircunferencia;
    }

    public Circulo() {
    }

    public double getxCentro() {
        return xCentro;
    }

    public void setxCentro(double xCentro) {
        this.xCentro = xCentro;
    }

    public double getyCentro() {
        return yCentro;
    }

    public void setyCentro(double yCentro) {
        this.yCentro = yCentro;
    }

    public double getxCircunferencia() {
        return xCircunferencia;
    }

    public void setxCircunferencia(double xCircunferencia) {
        this.xCircunferencia = xCircunferencia;
    }

    public double getyCircunferencia() {
        return yCircunferencia;
    }

    public void setyCircunferencia(double yCircunferencia) {
        this.yCircunferencia = yCircunferencia;
    }
}
