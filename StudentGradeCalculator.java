import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Taking marks
        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks in DSA: ");
        int dsa = sc.nextInt();

        System.out.print("Enter marks in DBMS: ");
        int dbms = sc.nextInt();

        System.out.print("Enter marks in OS: ");
        int os = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Calculate total
        int total = java + dsa + dbms + os + maths;

        // Calculate percentage
        double percentage = total / 5.0;

        // Calculate grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } 
        else if (percentage >= 80) {
            grade = 'B';
        } 
        else if (percentage >= 70) {
            grade = 'C';
        } 
        else if (percentage >= 60) {
            grade = 'D';
        } 
        else if (percentage >= 40) {
            grade = 'E';
        } 
        else {
            grade = 'F';
        }

        // Display result
        System.out.println("\n========== RESULT ==========");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } 
        else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}