package com.example.figurasmongo.services;

import com.example.figurasmongo.models.Circulo;

public interface CirculoRepository {
    public Circulo findByNumeracion(int numeracion);
}
