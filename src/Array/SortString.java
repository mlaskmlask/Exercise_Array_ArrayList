package Array;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] table = new String[10];
        table[0] = "Kasia";
        table[1] = "Janek";
        table[2] = "Grzesiek";
        table[3] = "Alicja";
        table[4] = "Bolek";
        table[5] = "Fryderyk";
        table[6] = "Ania";
        table[7] = "Gerwazy";
        table[8] = "Tomek";
        table[9] = "Janina";

        System.out.println("Nieposortowana tablica: " + Arrays.toString(table));
        Arrays.sort(table);
        System.out.println("Tablica posortowana alfabetycznie: " + Arrays.toString(table));

        }
    }


