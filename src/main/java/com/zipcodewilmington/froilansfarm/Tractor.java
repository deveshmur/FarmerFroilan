package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Tractor implements FarmVehicle {
    
    public Tractor() {

    }

    @Override
    public String makeNoise() {
        return "Vroom vroom!";
    }

    public void harvest(Crop crop) {
        crop.setHasBeenHarvested(true);
    }

    public void harvestCropRow(CropRow cropRow) {
        for (Crop crop : cropRow.getCrops()) {
            harvest(crop);
        }
    }
}
