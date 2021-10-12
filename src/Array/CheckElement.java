package Array;

public class CheckElement {
    public static void main(String[] args) {

        int[] table = {534, 399, 242, 124, 548, 632, 723, 994};
        System.out.println(checkIfTableContainsElement(table, 124));
    }

    public static boolean checkIfTableContainsElement(int[] table, int searchedNumber) {
        for (int i : table) {
            if (searchedNumber == i) {
                return true;
            }
        }
        return false;
    }
}
