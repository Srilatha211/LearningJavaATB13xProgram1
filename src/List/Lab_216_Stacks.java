package List;

import java.util.Stack;

public class Lab_216_Stacks {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("python");
        s1.add("c#");
        s1.add("Java");

//Stack - Last in first out

        System.out.println(s1);
        System.out.println(s1.peek());//Which will display the first element from stack
        System.out.println(s1.pop());//Will remove the element from top of the stack
        System.out.println(s1);

        // Create Integer type stack
        Stack<Integer> intStack = new Stack<>();

        // Create String type stack
        Stack<String> stringStack = new Stack<>();


        intStack.push(23);//push is also like adding the element
        intStack.push(43);
        intStack.push(53);
        System.out.println(intStack);

    }
}
