package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
<<<<<<< HEAD
=======
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
>>>>>>> ceef3e42fdc420e9327208c695e168389eb626ea

public abstract class Crop implements Produce {
    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public abstract Edible yield();
}