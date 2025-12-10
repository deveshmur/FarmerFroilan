package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato implements Edible {
    boolean isEdible = true;

    public Tomato() {
    }

    @Override
    public boolean getIsEdible() {
        return isEdible;
    }
}
