package Company.bytedance;


import org.junit.jupiter.api.Test;

class Que1Test {

    @Test
    void test() {
        Que1 q0 = new Que1("k", "12");
        Que1 q1 = new Que1("k", "12");
        if(q0.equals(q1)) {
            System.out.println(true);;
        } else {
            System.out.println(false);
        }
    }

}