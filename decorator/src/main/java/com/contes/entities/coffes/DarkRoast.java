package com.contes.entities.coffes;

import com.contes.entities.Beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return 0.99;
    }
    
}
