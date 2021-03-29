public class reverseWords {

    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        StringBuilder new_words = new StringBuilder("");
        String[] strs = s.split(" ");
        for(int i=0;i<strs.length;i++){
            String new_word = reverseWord(strs[i]);
            new_words.append(new_word);
            if( i != strs.length-1){
                new_words.append(" ");
            }

        }
        System.out.println(new_words.toString());

    }

    public static String reverseWord(String word){

        int length = word.length();
        StringBuilder newStr = new StringBuilder("");
        for(int i=length - 1;i >= 0;i--){
            String a = word.substring(i,i+1);
            newStr.append(a);
        }
        return newStr.toString();
    }
}
