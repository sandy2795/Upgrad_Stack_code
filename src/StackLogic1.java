
/*
Sample input1:
1 2 3
1 4 2 5 3
sample output1:
true

Sample input2:
1 2 3
1 2 4 5
sample output2:
false
 */


import java.util.Scanner;
import java.util.Stack;

public class StackLogic1 {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        //System.out.println(sequence1);
        Stack<Integer> sequence3 = new Stack<Integer>();
        boolean result = false;
        Object[] arr1 = sequence1.toArray();
        Object[] arr2 = sequence2.toArray();
        for(int i =0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    sequence3.push(j);
                }
            }
        }
        System.out.println(sequence3 +"==="+sequence3.size());
        if(sequence3.size() == sequence1.size()) {
            for (int k = 0; k < sequence3.size()-1; k++) { //5
                if (sequence3.elementAt(k) < sequence3.elementAt(k + 1)) {
                    result= true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
