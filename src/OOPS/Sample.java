package OOPS;

public class Sample {
    static void main(String[] args) {
        test t = new test();
        t.display();
    }
}

class test{
    static int x, y;
    test(){
        x = 10;
//        y = 20;
    }

    void test(){
        y = 20;
    }

    void display(){
        test();
        System.out.print(x + " " + y);
    }
}