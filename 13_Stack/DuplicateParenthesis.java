import java.util.*;
public class DuplicateParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // opening, operators, operands

            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                } else{
                    s.pop();
                }
            } else{
                s.push(ch);
            }
        }

        return false;
    }


    public static void main(String args[]){
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isValid(str2));
    }
}
