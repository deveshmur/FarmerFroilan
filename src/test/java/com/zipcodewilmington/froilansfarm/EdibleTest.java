package com.zipcodewilmington.froilansfarm;
    


import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.Tomato;   
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;  

public class EdibleTest {
   
        private Egg egg;
        private Corn corn;
        private Tomato tomato; 

    @BeforeEach
    public void setUp() {
        
        egg = new Egg(false);
        corn = new Corn(false);
        tomato = new Tomato(false);
    }   
    @Test
    public void testIsEdible() {
        assertTrue(egg.isEdible());
        assertTrue(corn.isEdible());
        assertTrue(tomato.isEdible());
    }  
    
    @Test
    public void testSetEdible() {
        egg.setEdible(false);
        corn.setEdible(false);
        tomato.setEdible(false);               

    }
}
      


