package MockTest;

import java.util.Scanner;

abstract class Person {
    private int id;
    private String name;

    Person(int x, String y){
        this.id = x;
        this.name = y;
    }

    public int getID(){ return id; }
    public String getName(){ return name; }

    abstract void calculateAnnualBenefit();
    abstract void displayDetails(int value);
}

class Student extends Person {
    int marks;
    Student(int id, String name){
        super(id, name);
    }

    @Override
    void calculateAnnualBenefit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Mark Percentage (%) : ");
        marks = sc.nextInt();
        displayDetails(marks);
    }

    @Override
    void displayDetails(int marks) {
        if (marks > 75){
            int scholarship = 50000;
            System.out.println(getID() + " " + getName() + " Student received " + scholarship + " scholarship");
        } else {
            System.out.println("Student is ineligible for Scholarship");
        }
    }
}

class Teacher extends Person {
    int salary;
    Teacher(int id, String name){
        super(id, name);
    }

    @Override
    void calculateAnnualBenefit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the TYeacher salary : ");
        salary = sc.nextInt();
        displayDetails(salary);
    }

    @Override
    void displayDetails(int salary) {
        int annualSalary = salary * 12;
        System.out.print("Teacher Annual salary" + annualSalary);
    }
}

public class oopsConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Person s = new Student(id, name);
        s.calculateAnnualBenefit();

        Person t = new Teacher(id, name);
        t.calculateAnnualBenefit();
    }
}
