package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop {
    
    public CornStalk() {
        super();
    }
    
    @Override
    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new EarCorn();
        }
        return null;
    }
}