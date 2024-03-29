package dev.ea3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted Array: " + Arrays.toString(intArray));


        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1]> newElement; i--){
                intArray[i] = intArray[i -1];
            }

            intArray[i] = newElement;

        }

         System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }
}