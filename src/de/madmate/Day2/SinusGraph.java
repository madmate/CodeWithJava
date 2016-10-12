package de.madmate.Day2;

/**
 * Created by markus on 11.10.16.
 */
public class SinusGraph {
    public static void main(String[] args) {
        for(int i = -30; i<=30; i++) {
            System.out.println("Y für X = "+i+" "+Math.sin(i));
        }
    }
}
