package de.madmate.Day2;

/**
 * Created by markus on 11.10.16.
 */
public class WaehrungsTest {
    public static void main(String[] args) {
        Euro betrag1 = new Euro();
        USDollar betrag2 = new USDollar();

        betrag1.setEuro(6);
        betrag2.setUsdollar(9);

        System.out.println(betrag2.toString());
    }
}
