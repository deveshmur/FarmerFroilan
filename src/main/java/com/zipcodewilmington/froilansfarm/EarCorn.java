package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class EarCorn implements Edible {
    boolean isEdible;

    public EarCorn() {
        this.isEdible = true;
    }

    @Override
    public boolean getIsEdible() {
        return isEdible;
    }
}

