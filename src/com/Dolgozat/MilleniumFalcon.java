package com.Dolgozat;

public class MilleniumFalcon implements Urhajo,Hiperhajtomu {
    private double tapasztalat;

    public MilleniumFalcon()
    {
        this.tapasztalat = 100.0;
    }



    @Override
    public void hiperUgras() {
        this.tapasztalat +=500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo u) {
        boolean l;
        if(u.milyenGyors() < this.milyenGyors())
        {
            l = true;
        }
        else
            {
                l = false;
            }
        return l;
    }

    @Override
    public double milyenGyors() {
        return this.tapasztalat*2;
    }

    @Override
    public String toString() {
        return "MilleniumFalcon "+super.toString();

    }
}
