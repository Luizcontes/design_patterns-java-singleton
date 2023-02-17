package com.contes.entities.coffes;

import com.contes.entities.Beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
    
}
