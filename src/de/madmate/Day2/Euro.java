package de.madmate.Day2;

/**
 * Created by markus on 11.10.16.
 */
public class Euro extends Waehrung {

    public double getEuro() {
        return getUsdollar()*0.9;
    }

    public void setEuro(double euro) {
        setUsdollar(euro*1.1);
    }

    @Override
    public String toString() {
        return getEuro()+" €";
    }
}
