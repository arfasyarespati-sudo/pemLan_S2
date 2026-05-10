package DSA;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack s = new Stack<String>();

        s.push("A");
        s.push("B");
        s.push("C");

        String e = (String) s.peek();

        e = (String) s.pop();
        System.out.println(e);

    }
}
