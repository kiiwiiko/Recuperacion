package com.example.figurasmongo.services;

import com.example.figurasmongo.models.Circulo;
import com.example.figurasmongo.models.Triangulo;

public interface TrianguloRepository {
    public Triangulo findByNumeracion(int numeracion);
}
