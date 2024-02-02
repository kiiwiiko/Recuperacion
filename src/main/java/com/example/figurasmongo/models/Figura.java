package com.example.figurasmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Figura {
    @Id
    private String id;
    @Indexed(name="numeracion",unique = true)
    private int numeracion;
    private double perimetro;
    private double area;

    public Figura(int numeracion, double perimetro, double area) {
        this.numeracion = numeracion;
        this.perimetro = perimetro;
        this.area = area;
    }

    public Figura() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
