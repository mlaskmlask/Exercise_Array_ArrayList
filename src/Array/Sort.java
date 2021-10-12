package Array;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] table = new int[5];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(50);
        }
        System.out.println("Nieposortowana tablica: " + Arrays.toString(table));
        Arrays.sort(table);
        System.out.println("Posortowana tablica: " + Arrays.toString(table));
    }
}
