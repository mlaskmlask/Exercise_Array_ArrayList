package Array;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] table = {4, 45, 76, 23, 65, 12, 76, 43};

        System.out.println("Tablica przed wstawieniem nowej wartości: " + Arrays.toString(table));

        int indexPosition = 3;
        int newValue = 33;

        for (int i = table.length-1; i > indexPosition; i--) {
            table[i] = table[i - 1];
        }
        table[indexPosition] = newValue;
        System.out.println("Nowa tablica: " + Arrays.toString(table));
    }
}
