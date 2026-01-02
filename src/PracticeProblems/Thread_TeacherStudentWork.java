package PracticeProblems;

class Task {
    synchronized void work() throws InterruptedException {
        System.out.println("Teacher Assigns Work");
        wait();
        System.out.println("Teacher Continues the Work");
    }
    synchronized void taskDone() {
        System.out.println("Students Finishes the task");
        notify();
    }
}

class Teacher extends Thread {
    Task task;
    Teacher(Task t) {
        this.task = t;
    }
    public void run() {
        try {
            task.work();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Student extends Thread {
    Task task;
    Student(Task t) {
        this.task = t;
    }
    public void run() {
        try {
            task.taskDone();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Thread_TeacherStudentWork {
    static void main(String[] args) {
        Task task = new Task();
        Teacher t1 = new Teacher(task);
        Student s1 = new Student(task);
        t1.start();
        s1.start();
    }
}
