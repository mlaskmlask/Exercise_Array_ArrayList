package Array;

import java.util.Arrays;
import java.util.Random;

public class AverageValue {
    public static void main(String[] args) {
        double sumOfNumbers = 0;
        double average;
        Random random = new Random();

        int[] table = new int[10];
        for (int i = 0; i<table.length; i++){
            table[i] = random.nextInt(60);
        }
        System.out.println("Tablica liczb: " + Arrays.toString(table));

        for(int i : table){
            sumOfNumbers += i;
        }
        average = sumOfNumbers/table.length;
        System.out.println("Średnia wynosi: "+ average);

    }
}
