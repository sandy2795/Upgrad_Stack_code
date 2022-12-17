/*
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]

Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]
 */
import java.util.*;

import static java.lang.Math.floor;

public class HalfReverseSort {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        Object[] arr = stack.toArray();
        int size = arr.length;
        double half = floor(stack.size()/2);
        //System.out.println("Size:"+size+" half:"+half);
        //1st half
        for (int i = 0; i < (int)half; i++) {
           // System.out.print(arr[i]+" ");
            for (int j = 1; j < (half - i); j++) {
                if ((int)arr[j - 1] > (int)arr[j]) {
                    int temp = (int)arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //2nd half
        for (int i = (int)half; i < size; i++) {
             //System.out.print(arr[i]+" ");
            for (int j = 1; j < (size - i); j++) {
                if ((int)arr[size - 1] < (int)arr[j]) {
                    int temp = (int)arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}