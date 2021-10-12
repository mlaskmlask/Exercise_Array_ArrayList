package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ala");
        list1.add("Ola");
        list1.add("Basia");

        List<String> list2 = new ArrayList<>();
        list2.add("Janek");
        list2.add("Stefan");
        list2.add("Adam");

        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);

    }

}
