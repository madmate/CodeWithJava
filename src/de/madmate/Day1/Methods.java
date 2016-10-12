package de.madmate.Day1;

/**
 * Created by markus on 10.10.16.
 */
public class Methods {
    public static void main(String[] args) {
        Operatoren operatoren = new Operatoren();
        System.out.println(baum('a'));
        System.out.println(operatoren.addition(4.5, 3.7));
    }

    private static int baum(char c) {
        return (int) c;
    }

    private static String Haus() {
        return "Das Haus ist schön!";
    }
}
