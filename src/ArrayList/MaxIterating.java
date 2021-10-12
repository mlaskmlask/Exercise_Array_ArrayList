package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxIterating {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(65);
        list.add(34);
        list.add(75);
        list.add(45);
        list.add(15);
        list.add(67);
        list.add(83);

        int currentMax = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > currentMax) {
                currentMax = list.get(i);
            }
        }
        System.out.println(currentMax);
    }
}
