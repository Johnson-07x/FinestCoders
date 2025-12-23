package OOPS;

class grandpa {
    void sample() {
        System.out.println("I am One");
    }
}

class cousin extends grandpa {
    void sample4() {
        System.out.println("I am Four");
    }

}

class father extends cousin{
    void sample2() {
        System.out.println("I am Two");
    }
}

class son extends father {
    void sample3() {
        System.out.println("I am Three");
    }
}

//class fifth extends father, son{
//    void sample4() {
//
//    }
//}

public class MultiLevelInheritance {
    static void main(String[] args) {
        son s1 = new son();
//        cousin c1 = new cousin();
        s1.sample3();
        s1.sample();
        s1.sample2();
        s1.sample4();
    }
}
