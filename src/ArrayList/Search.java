package ArrayList;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Michał");
        list.add("Janusz");
        list.add("Ola");
        list.add("Kasia");

        if (list.contains("Ola")){
            System.out.println("Jest.");
        } else {
            System.out.println("Nie ma. ");
        }
    }
}