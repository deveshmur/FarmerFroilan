package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProduceTest {
    
    @Test 
    public void testYield() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        
        Edible result = cornStalk.yield();
        assertNotNull(result);
        assertTrue(result instanceof EarCorn);
    }
    
    @Test
    public void testHasBeenFertilized() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.hasBeenFertilized());
        
        cornStalk.setHasBeenFertilized(true);
        assertTrue(cornStalk.hasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvested() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.hasBeenHarvested());
        
        cornStalk.setHasBeenHarvested(true);
        assertTrue(cornStalk.hasBeenHarvested());
    }
}
