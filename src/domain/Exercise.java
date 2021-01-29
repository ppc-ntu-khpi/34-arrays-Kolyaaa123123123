package domain;

import domain.Exercise;

/**
 * Method that returns value of the second bigger value
 * @author Kolja
 */
public class Exercise {
    public static int SecondBigNumber(int[] array){ 
        Arrays.sort(array); 
        int secondBig = array[array.length - 2]; 
        return secondBig; 
    }
}
