package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    
    @Test
    public void testYieldReturnsEarCorn() {
        CornStalk cornStalk = new CornStalk();
        Edible result = cornStalk.yield();
        assertTrue(result instanceof EarCorn);
    }
    
    @Test
    public void testYieldReturnsEdible() {
        CornStalk cornStalk = new CornStalk();
        Edible result = cornStalk.yield();
        assertTrue(result.getIsEdible());
    }
    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        assertTrue(cornStalk.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.harvest();
        assertTrue(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        cornStalk.harvest();
        assertTrue(cornStalk.getHasBeenFertilized());
        assertTrue(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        CornStalk cornStalk = new CornStalk();
        assertTrue(cornStalk instanceof Produce);
    }
}