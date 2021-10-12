package ArrayList;

import java.util.ArrayList;

public class GetElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Małgorzata");
        list.add("Kasia");
        list.add("Jan");
        list.add("Tomasz");
        System.out.println(list);

        String firstElement = list.get(0);
        System.out.println("Pierwszy element listy to: " + firstElement);
        String lastElement = list.get(4);
        System.out.println("Ostatni element listy to: " + lastElement);
    }
}
