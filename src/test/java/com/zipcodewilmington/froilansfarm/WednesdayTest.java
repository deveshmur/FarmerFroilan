package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WednesdayTest {

    private Farm farm;
    private Farmer froilan;
    private Pilot froilanda;

    @BeforeEach
    void setup() {
        farm = new Farm();  

        List<Person> residents = farm.getFarmHouse().getAll();

        froilan = (Farmer) residents.get(0);
        froilanda = (Pilot) residents.get(1);
    }

    @Test
    void testMorningHorseRiding() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAll()) {

                assertTrue(horse.mount(froilan));
                assertTrue(horse.isMounted());
                assertTrue(horse.dismount(froilan));
                assertFalse(horse.isMounted());

                assertTrue(horse.mount(froilanda));
                assertTrue(horse.isMounted());
                assertTrue(horse.dismount(froilanda));
                assertFalse(horse.isMounted());
            }
        }
    }

    @Test
    void testHorseFeeding() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAll()) {

                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());

                assertTrue(horse.hasBeenFed());
            }
        }
    }

    @Test
    void testFroilanBreakfast() {

        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());

        for (int i = 0; i < 5; i++) {
            froilan.eat(new Egg(false)); 
        }

        assertTrue(froilan.hasBeenFed());
    }

    @Test
    void testFroilandaBreakfast() {

        froilanda.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new Tomato());
        froilanda.eat(new Egg(false));
        froilanda.eat(new Egg(false));

        assertTrue(froilanda.hasBeenFed());
    }
}
