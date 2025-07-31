
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student information
        System.out.println("=== Welcome to Harvard University Portal ===");
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        // Display student information
        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        // Get academic scores
        System.out.println("\n--- INPUT ACADEMIC SCORES ---");
        System.out.print("Midterm Exam Score (0-100): ");
        int midterm = scanner.nextInt();

        System.out.print("Final Exam Score (0-100): ");
        int finalExam = scanner.nextInt();

        System.out.print("Project Score (0-100): ");
        int project = scanner.nextInt();

        System.out.print("Attendance Percentage (0-100): ");
        int attendance = scanner.nextInt();

        // Calculate average score
        int totalScore = midterm + finalExam + project + attendance;
        double averageScore = (totalScore / 400.0) * 100;

        // Display academic performance
        System.out.println("\n--- STUDENT SCORES ---");
        System.out.println("Midterm Exam Score: " + midterm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);
        System.out.printf("Average Score: %.2f\n", averageScore);

        // Display result
        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";
        System.out.println("Remarks: " + remarks);

        System.out.println("\nThank you for using the Harvard Student Portal.");

        scanner.close();
    }
}



