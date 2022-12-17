import java.util.*;

public class Print5thElement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        if(stack.size()<=4){
            System.out.println("There are not enough elements in the stack");
        }
        else{
            int index = stack.size() - 5;
            for(int i =1;i<=index;i++){
                stack.pop();
            }
            System.out.println(stack.peek());
        }

    }
}
