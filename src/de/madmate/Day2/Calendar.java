package de.madmate.Day2;

import java.util.Scanner;

/**
 * Created by markus on 11.10.16.
 */
public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] day = new String[24];
        for (int i = 0; i<day.length; i++) {
            day[i] = "";
        }
        int stunde;
        while (true) {
            System.out.println("1 für Eingabe, 2 für Augabe und mit 3 beenden");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Gebe die Stunde ein ");
                    stunde = scanner.nextInt();
                    System.out.println("Was willst du dort machen?");
                    scanner.nextLine();
                    day[stunde] = scanner.nextLine();
                    System.out.println("Eingabe erfolgreich");
                    break;
                case 2:
                    for (int i = 0; i < day.length; i++) {
                        System.out.println("Stunde " + i + ": " + day[i]);
                    }

                    break;
                case 3:
                    return;

            }
        }
    }
}
