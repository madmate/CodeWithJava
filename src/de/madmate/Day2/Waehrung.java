package de.madmate.Day2;

/**
 * Created by markus on 11.10.16.
 */
public class Waehrung {
    private double usdollar;

    public double getUsdollar() {
        return usdollar;
    }

    public void setUsdollar(double usdollar) {
        this.usdollar = usdollar;
    }

    public String toString() {
        return getUsdollar()+" $";
    }
}
