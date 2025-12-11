package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

public class SundayTest {

    @Test
    void wednesdayPlanting() {

        MorningTest morning = new MorningTest();
        morning.performMorningRoutine();

        Farm farm = morning.farm;
        Farmer froilan = (Farmer) farm.getFarmHouse().get(0);

        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        Field field = farm.getField();

        froilan.plant(new CornStalk(), field.getRow(0));
        froilan.plant(new TomatoPlant(), field.getRow(1));
        froilan.plant(new CarrotPlant(), field.getRow(2));
    }
}




