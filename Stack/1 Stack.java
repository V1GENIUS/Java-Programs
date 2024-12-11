package Stack;

import java.util.Stack;

class vivek {
    public static void main(String[] args) {
        Stack<Integer> str = new Stack<>();

        // Push An item in stack

        str.push(45);
        str.push(76);

        System.out.println(str);

        // peek() -> find the top eleemnt

        System.out.println(str.peek());

        // pop() for remove/pop the element
        str.pop();

        System.out.println(str);
    }
}