package de.madmate;

/**
 * Created by markus on 10.10.16.
 */
public class Switches {
    public static void main() {
        int z = 5;
        switch(z) {
            case 1:
                System.out.println("Z ist 1");
                break;
            case 2:
                System.out.println("Z ist 2");
                break;
            case 3:
                System.out.println("Z ist 3");
                break;
            case 5:
                System.out.println("Z ist 5");
                break;
            default:
                System.out.println("Z ist "+z);
                break;
        }
        double x = Math.random();

    }
}
