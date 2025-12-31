package ExceptionHandling;

import java.util.Scanner;

class validAgeException extends Exception {
    validAgeException(String msg) {
        super(msg);
    }
}

public class BasicExceptionClass {
    static void vote(int age) throws validAgeException {
        if (age < 18) {
            throw new validAgeException("Vote Invalid");
        }
        System.out.println("Vote valid");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Age: ");
        int age = sc.nextInt();
        try {
            vote(age);
        }catch (validAgeException e) {
            System.out.println(e);
        }
    }
}
