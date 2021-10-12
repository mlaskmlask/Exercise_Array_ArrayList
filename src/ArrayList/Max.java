package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(75);
        list.add(27);
        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);
        }
    }

