package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
    
    @Test
    public void testYieldReturnsTomato() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible result = tomatoPlant.yield();
        assertTrue(result instanceof Tomato);
    }
    
    @Test
    public void testYieldReturnsEdible() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible result = tomatoPlant.yield();
        assertTrue(result.getIsEdible());
    }
    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        assertTrue(tomatoPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.harvest();
        assertTrue(tomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        tomatoPlant.harvest();
        assertTrue(tomatoPlant.getHasBeenFertilized());
        assertTrue(tomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertTrue(tomatoPlant instanceof Produce);
    }
}