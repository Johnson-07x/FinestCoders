package OOPS;

class grandpa1 {
    void helo1() {
        System.out.println("Hello GrandPa");
    }
}

interface father1 {
    int x = 100;
    void helo2();
}

interface cousin1 {
    int x = 5;
    void helo3();
}

class dummyClass extends grandpa1 implements father1, cousin1{
    public void helo2() {
        System.out.println("Hello Father " + father1.x);
    }

    public void helo3() {
        System.out.println("Hello Cousin " + cousin1.x);
    }
}

class son1 extends dummyClass{
    void helo4() {
        System.out.println("Hello Son");
    }
}

class child1 extends son1{
    void helo5() {
        System.out.println("Hello Child");
    }
}

public class MultipleInheritance {
    static void main(String[] args) {
        child1 c = new child1();
        c.helo1();
        c.helo2();
        c.helo3();
        c.helo4();
        c.helo5();
    }
}
