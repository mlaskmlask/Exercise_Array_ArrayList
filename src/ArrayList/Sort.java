package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Małgorzata");
        list.add("Kasia");
        list.add("Jan");
        list.add("Tomasz");
        Collections.sort(list);
        System.out.println(list);
    }
}
