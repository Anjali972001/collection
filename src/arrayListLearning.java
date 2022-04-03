import java.util.ArrayList;

public class arrayListLearning {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);
        a.set(1,5);
        System.out.println(a);
        a.remove(3);
        System.out.println(a);


    }
}
