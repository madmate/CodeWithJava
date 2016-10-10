package de.madmate;

/**
 * Created by markus on 10.10.16.
 */
public class Arrays {
    public static void main(String[] args) {
        int arr1[] = new int[9];
        for (int i= 0; i<arr1.length; i++) {
            arr1[i] = i;
        }
        int arr2[] = {1,2,3,4,5,6,7,8,9};

        for (int x:arr1) {
            System.out.println(x);
        }

    }
}
