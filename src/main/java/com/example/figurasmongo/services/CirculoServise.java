package com.example.figurasmongo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CirculoServise {

    private  CirculoRepository circuloRepository;

    public CirculoServise(CirculoRepository circuloRepository) {
        this.circuloRepository = circuloRepository;
    }


}
