package OOPS;

import javax.lang.model.element.Name;

class parent {
    String s;
    parent(){
        s = "Unknown";
    }
}

class child extends parent{
    String s;
    child(){
        s = "farid";
    }
    void display(){
        System.out.println("Name: " + super.s);
        System.out.println("Name: " + s);
    }
}

public class Abstract {
    static void main(String[] args) {
        child c = new child();
        c.display();
    }
}