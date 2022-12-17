
import java.util.Scanner;

public class ParenthesesMatching {
    public static boolean match(String parens) {
        //write your code here
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }
}
