package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce<T extends Edible>{
    Edible yield();
}
