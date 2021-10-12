package Array;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;

        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = i;
            System.out.println(table[i]);
        }

        for (int i : table) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
