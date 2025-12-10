package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    private Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    // ---------------------------------------------------------------
    // Constructor & Basic Getters/Setters
    // ---------------------------------------------------------------

    @Test
    void testConstructor() {
        assertEquals("Chicken", chicken.getName());
        assertFalse(chicken.getHasBeenFertilized());
        assertFalse(chicken.getHasBeenHarvested());
    }

    @Test
    void testSetAndGetHasBeenFertilized() {
        chicken.setHasBeenFertilized(true);
        assertTrue(chicken.getHasBeenFertilized());
    }

    @Test
    void testSetAndGetHasBeenHarvested() {
        chicken.setHasBeenHarvested(true);
        assertTrue(chicken.getHasBeenHarvested());
    }

    // ---------------------------------------------------------------
    // Noise
    // ---------------------------------------------------------------

    @Test
    void testMakeNoise() {
        assertEquals("Cluck cluck!", chicken.makeNoise());
    }

    // ---------------------------------------------------------------
    // Yield Behavior
    // ---------------------------------------------------------------

    @Test
    void testYieldUnfertilizedEgg() {
        chicken.setHasBeenFertilized(false);
        chicken.setHasBeenHarvested(false);

        Edible result = chicken.yield();

        assertNotNull(result);
        assertTrue(result instanceof Egg);
        assertTrue(((Egg) result).getIsEdible());
        assertTrue(chicken.getHasBeenHarvested());
    }

    @Test
    void testYieldFertilizedEgg() {
        chicken.setHasBeenFertilized(true);
        chicken.setHasBeenHarvested(false);

        Edible result = chicken.yield();

        assertNotNull(result);
        assertTrue(result instanceof Egg);
        assertFalse(((Egg) result).getIsEdible());
        assertTrue(chicken.getHasBeenHarvested());
    }

    @Test
    void testYieldAfterAlreadyHarvestedReturnsNull() {
        chicken.setHasBeenFertilized(false);
        chicken.setHasBeenHarvested(true);

        Edible result = chicken.yield();

        assertNull(result);
    }

    // ---------------------------------------------------------------
    // Eating Behavior
    // ---------------------------------------------------------------

    @Test
    void testEatCornDoesNotThrow() {
        Edible corn = new EarCorn();
        assertDoesNotThrow(() -> chicken.eat(corn));
    }

    @Test
    void testEatNonCornDoesNotThrow() {
        // Testing with something that is Edible but not EarCorn
        Edible otherFood = new Edible() { 
            @Override
            public boolean getIsEdible() {
                return true;
            }
        };
        assertDoesNotThrow(() -> chicken.eat(otherFood));
    }
}
