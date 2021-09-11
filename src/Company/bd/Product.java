package Company.bd;

public class Product {

    private static Product Instance;

    public Product getInstance() {
        if (Instance == null) {
            Instance = new Product();
        }
        return Instance;
    }

    public static void main(String[] args) {
        char ch = '\u2a00';
        System.out.println(ch);
        String str = "你好啊";
        System.out.println(str.charAt(2));
    }

}
