/*
Stack(bottom -> top) = [6, 12, 3, 4]
Output: [3, 4, 6,12]

Sample Input:
12
6 12 3 4 5 1 7 8 10 9 11 2

Sample Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 */
import java.util.*;

public class StackSort {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
        Object[] arr = stack.toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if ((int)arr[j - 1] > (int)arr[j]) {
                    int temp = (int)arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); // returning the final sorted array
    }
}
