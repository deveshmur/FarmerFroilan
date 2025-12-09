package com.zipcodewilmington.froilansfarm;
    


import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.Tomato;   
import static org.junit.jupiter.api.Assertions;

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
        Assertions.assertTrue(egg.isEdible());
        Assertions.assertTrue(corn.isEdible());
        Assertions.assertTrue(tomato.isEdible());
    }  
    
    @Test
    public void testSetEdible() {
        egg.setEdible(false);
        corn.setEdible(false);
        tomato.setEdible(false);               

    }
}
      


