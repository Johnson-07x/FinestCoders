package OOPS;

interface animal {
    default void sound() {
        System.out.print("Hello 1");
        sound1();
    }

    default void sound1(){
        System.out.print("2");
    }
}

class dummy implements animal {

}

public class InheritanceWithDefaultMethod {
    static void main(String[] args) {
        dummy d = new dummy();
        d.sound();
    }
}
