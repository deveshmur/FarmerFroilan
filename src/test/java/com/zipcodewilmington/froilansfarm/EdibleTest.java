package com.zipcodewilmington.froilansfarm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;  

public class EdibleTest {
    private Egg egg;
    private EarCorn corn;
    private Tomato tomato; 
    
    @BeforeEach
    public void setUp() {
        egg = new Egg(false);
        corn = new EarCorn();
        tomato = new Tomato();
    }   
    
    @Test
    public void testIsEdible() {
        assertTrue(egg.getIsEdible());
        assertTrue(corn.getIsEdible());
        assertTrue(tomato.getIsEdible());
    }  
}
      


