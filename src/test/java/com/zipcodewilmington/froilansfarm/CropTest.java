package com.zipcodewilmington.froilansfarm; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {

    private static class TestCrop extends Crop {
        private Edible testEdible;

        public TestCrop(Edible edibleToYield) {
            this.testEdible = edibleToYield;
            }

        public Edible yield() {
            if (getHasBeenFertilized() && !getHasBeenHarvested()) {
                return testEdible;
                }
                return null;
            }
    }

    private static class TestEdible implements Edible {
        @Override
        public boolean getIsEdible() {
            return true;
       }
    }

    private TestCrop crop;
    private Edible testEdible;

    @BeforeEach
    public void setUp() {
        testEdible = new TestEdible();
        crop = new TestCrop(testEdible);
    }

    @Test
    public void testCropStartsUnfertilized() {
        assertFalse(crop.getHasBeenFertilized());
    }

    @Test
    public void testCropStartsUnharvested() {
        assertFalse(crop.getHasBeenHarvested());
    }

    @Test
    public void testSetHasBeenFertilized() {
        assertFalse(crop.getHasBeenFertilized());
        crop.setHasBeenFertilized(true);
        assertTrue(crop.getHasBeenFertilized());
    }

    @Test
    public void testSetHasBeenHarvested() {
        assertFalse(crop.getHasBeenHarvested());
        crop.setHasBeenHarvested(true);
        assertTrue(crop.getHasBeenHarvested());
    }

    @Test
    public void testCropCantYieldWhenNotFertilized() {
        crop.setHasBeenHarvested(false);
        crop.setHasBeenFertilized(false);
        Edible result = crop.yield();
        assertNull(result);
    }

    @Test
    public void testCropCantYieldWhenNotHarvested() {
        crop.setHasBeenFertilized(true);
        crop.setHasBeenHarvested(true);
        Edible result = crop.yield();
        assertNull(result);
    }

    @Test
    public void testCropYieldsWhenFertilizedAndHarvested() {
        crop.setHasBeenFertilized(true);
        crop.setHasBeenHarvested(false);
        Edible result = crop.yield();
        assertNotNull(result);
        assertEquals(testEdible, result);
    }
}

