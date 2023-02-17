package com.contes.entities.condiments;

import com.contes.entities.Beverage;

public class Mocha {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
}
