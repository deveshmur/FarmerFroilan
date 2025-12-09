package com.zipcodewilmington.froilansfarm;

public interface Produce {
    String yield();
    
    default boolean HasBeenFertilized() {
        return false;
    }

    default boolean HasBeenHarvested() {
        return false;
    }
    
}
