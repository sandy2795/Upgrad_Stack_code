import java.util.Scanner;
import java.util.*;

public class ReverseByStack{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        for(int i=0;i<data.length();i++){
            s.push(data.charAt(i));
        }
        String rev = "";
        for(int j = 1;j<=data.length();j++){
            rev = rev+s.peek();
            s.pop();
        }
        System.out.println(rev);


    }
}

