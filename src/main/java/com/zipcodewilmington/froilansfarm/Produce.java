package com.zipcodewilmington.froilansfarm;

public interface Produce {
    Edible yield();
    boolean hasBeenFertilized();
    boolean hasBeenHarvested();
}
