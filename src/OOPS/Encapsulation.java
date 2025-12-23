package OOPS;

import java.util.Scanner;

class ATM {
    private int balance;
    void check(int pin) {
        System.out.println("PIN is inValid");
    }
    void withdraw() {

    }
    void balance() {

    }

    class newATM {

    }
}

public class Encapsulation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the PIN: ");
        int pin = sc.nextInt();
        ATM a = new ATM();
        a.check(pin);
    }
}
