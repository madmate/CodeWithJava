package de.madmate.Day2;

/**
 * Created by markus on 11.10.16.
 */
public class SplitStrings {

    public static void main(String[] args) {
        String nameOne = "Lisa Rose";
        String nameTwo = "Karl Müller";

        String [] nameOneSplit = nameOne.split(" ");
        String [] nameTwoSplit = nameTwo.split(" ");

        System.out.println(nameOneSplit[0]+" "+nameTwoSplit[1]);
        System.out.println(nameTwoSplit[0]+nameOneSplit[1]);






    }
}
