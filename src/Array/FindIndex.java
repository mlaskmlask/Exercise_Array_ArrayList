package Array;

public class FindIndex {
    public static void main(String[] args) {
        int[] table = {23, 56, 34, 75, 23, 78};

        System.out.println(findIndex(table, 23));
    }

    public static int findIndex(int[] table, int value) {
        for (int i : table) {
            if (table == null) return -1;
        }

        int length = table.length;
        int i = 0;
        while (i < length) {
            if (table[i] == value) return i;
            else i++;
        }
        return -1;
    }
}
