package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 7, 8, 3, 2, 4, 6, 101, 100, 1}; 
        int result = Exercise.SecondBigNumber(array); 
        System.out.println(result); 
    }
}
