package ArrayList;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Michał");
        list.add("Janusz");
        list.add("Ola");
        list.add("Kasia");
        list.add(0, "Darek");
        list.add(5, "Anna");
        System.out.println(list);
    }
}
