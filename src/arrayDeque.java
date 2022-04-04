import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        aq.offer(12);
        aq.offer(23);
        aq.offer(34);
        System.out.println(aq);
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
        System.out.println(aq.pollLast());
        System.out.println(aq.poll());
        System.out.println(aq.pollFirst());
        System.out.println(aq);
    }
}
