package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Pilot extends Person implements Rider  {
   
    private Rideable currentMount;

    public Pilot(String name) {
        super(name);
        this.currentMount = null;
    }

    @Override
    public String makeNoise() {
        return getName() + " says 'UML!'";
    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable != null && rideable.mount(this)) {
            this.currentMount = rideable;
        }
    }

    @Override
    public void dismount(Rideable rideable) {
        if (rideable != null && currentMount == rideable) {
            if (rideable.dismount(this)) {
                this.currentMount = null;
            }
        }
    }

    public boolean isRiding() {
        return currentMount != null;
    }

    public Rideable getCurrentMount() {
        return currentMount;
    }

    public void fly (Aircraft aircraft) {
        if (aircraft != null) {
            aircraft.fly();
        }
    }

}
