package Company.bytedance;

public class Que1 {

    private String name;
    private String age;

    public Que1(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Que1 q = (Que1)obj;
        if (q.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}
