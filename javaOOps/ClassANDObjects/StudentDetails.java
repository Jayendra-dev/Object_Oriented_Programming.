
import java.util.Scanner;

class Student {

    // Data members
    String name;
    int rollNo;

    double marks1, marks2, marks3, marks4, marks5;

    double total;
    double percentage;

    // Method to accept student details
    void input(Scanner sc) {

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        marks1 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 2: ");
        marks2 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 3: ");
        marks3 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 4: ");
        marks4 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 5: ");
        marks5 = sc.nextDouble();
    }

    // Method to calculate total and percentage
    void calculate() {

        total = marks1 + marks2 + marks3 + marks4 + marks5;

        percentage = (total / 500) * 100;
    }

    // Method to display student details
    void display() {

        System.out.println("\n===== STUDENT DETAILS =====");

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);

        System.out.println("Subject 1 Marks: " + marks1);
        System.out.println("Subject 2 Marks: " + marks2);
        System.out.println("Subject 3 Marks: " + marks3);
        System.out.println("Subject 4 Marks: " + marks4);
        System.out.println("Subject 5 Marks: " + marks5);

        System.out.println("Total Marks: " + total + "/500");

        System.out.println("Percentage: " + percentage + "%");
    }
}

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object
        Student s1 = new Student();

        // Calling methods
        s1.input(sc);

        s1.calculate();

        s1.display();

        sc.close();
    }
}


/*
output:
===== STUDENT DETAILS =====
Student Name: jayendra
Roll Number: 78
Subject 1 Marks: 99.0
Subject 2 Marks: 99.0
Subject 3 Marks: 99.0
Subject 4 Marks: 99.0
Subject 5 Marks: 100.0
Total Marks: 496.0/500
Percentage: 99.2%*/
