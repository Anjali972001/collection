import java.util.Stack;

public class stackLearning {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("goat");
        animal.push("dog");
        animal.push("cat");
        animal.push("monkey");
        System.out.println(animal);

        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal);

    }
}
