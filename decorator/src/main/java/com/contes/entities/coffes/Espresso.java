package com.contes.entities.coffes;

import com.contes.entities.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
    
}
