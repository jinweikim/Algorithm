public class InverseString {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int j = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            stringBuilder.append(s.substring(i + 1, j + 1)).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}
