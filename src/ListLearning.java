import java.util.ArrayList;
import java.util.List;

public class ListLearning {
    public static void main(String[] args) {
        List <String> b =new ArrayList<>();
        b.add("dog");
        b.add("cat");
        b.add("monkey");
        b.add("mouse");
        System.out.println(b);
        b.add(1,"parrot");
        System.out.println(b);
        List<String> newList =new ArrayList<>();
        newList.add("snake");
        newList.add("cow");
        b.addAll(newList);
        System.out.println(b);
        System.out.println(b.get(1));
        System.out.println(b.remove(1));
        b.remove(String.valueOf("monkey"));
        System.out.println( b.contains("cat"));


    }
}
