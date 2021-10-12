package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateList {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");

        list.set(1, "mno");

        System.out.println(list);
    }

}
