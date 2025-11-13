package ex_37_CollectionFramework.List;

import java.util.Stack;

public class Lab276_Stack {
    public static void main(String[] args) {
        Stack stack=new Stack();//Last in first out
        stack.add("Shraddha");
        stack.add("Dhuri");
        stack.add("Amita");
        stack.add(123);
        stack.add(true);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        stack.add("Snehal");
        System.out.println(stack);
        stack.add("chetan");
        stack.add("chetan");
        System.out.println(stack);

        System.out.println(stack.get(0));
        System.out.println(stack.get(1));

    }
}
