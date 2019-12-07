package com.Dolgozat;

public abstract class LazadoGep implements Urhajo{

    private boolean meghibasodhatE;
    private double sebesseg;

    public LazadoGep(double sebesseg,boolean meghibasodhatE)
    {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;

    }

    public double getSebesseg() {
        return sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    @Override
    public double milyenGyors()
    {
        return this.sebesseg;
    }

    @Override
    public boolean legyorsuljaE(Urhajo u) {
       if(u instanceof MilleniumFalcon)
       {
           return (((MilleniumFalcon)u).milyenGyors() < 2*this.sebesseg) ? true: false;
       }
       else
           {
               return(((LazadoGep)u).isMeghibasodhatE() && u.milyenGyors() < this.sebesseg) ? true : false;
           }
    }

    @Override
    public String toString() {
        return "LazadoGep{" +
                "sebesseg=" + sebesseg +
                ", meghibasodhatE=" + meghibasodhatE +
                '}';
    }
}
