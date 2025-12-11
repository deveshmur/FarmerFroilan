package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

public class WednesdayTest {

    @Test
    void wednesdayPlanting() {

        MorningTest morning = new MorningTest();
        morning.performMorningRoutine();

        Farm farm = morning.farm;
        Farmer froilan = (Farmer) farm.getFarmHouse().get(0);

        CropRow wednesdayRow = new CropRow();

        farm.getField().addRow(wednesdayRow);
        farm.getField().addRow(wednesdayRow);
        farm.getField().addRow(wednesdayRow);
        farm.getField().addRow(wednesdayRow);
        farm.getField().addRow(wednesdayRow);
        Field field = farm.getField();

        froilan.plant(new CornStalk(), field.getRow(3));
        froilan.plant(new CarrotPlant(), field.getRow(4));
    }
}