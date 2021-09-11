package Exercise;

import java.util.Stack;

public class LengthOfLastWord {

    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(solution(str));


    }

    public static int solution(String str){

        str = str.trim();
        int length = str.length();
        Stack<String> stack = new Stack<>();

        for(int i = length-1;i >= 0;i--){
            String s = str.substring(i,i+1);
            if( s.equals(" ")){
                break;
            }
            stack.push(s);
        }
        StringBuilder stringBuilder = new StringBuilder("");
        int stack_length = stack.size();
        for( int i=0; i<stack_length;i++){
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString().length();

    }

}
