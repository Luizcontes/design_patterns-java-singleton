package com.contes.entities.condiments;

import com.contes.entities.Beverage;

public class Mocha extends Beverage{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
    
}
