package com.Dolgozat;

import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu{


    public XWing() {
        super(150, true);
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return (this.isMeghibasodhatE() && getSebesseg() < 10000) ? true : false;
    }

    @Override
    public void hiperUgras() {
        double gyorsulas = Math.random()*100;
        setSebesseg(getSebesseg()+gyorsulas);
    }

    @Override
    public String toString() {
        return "XWing "+super.toString();
    }
}
