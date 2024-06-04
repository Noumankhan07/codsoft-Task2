import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for Java (out of 100): ");
        int javaMarks = scanner.nextInt();

        System.out.println("Enter the marks for Python (out of 100): ");
        int pythonMarks = scanner.nextInt();

        System.out.println("Enter the marks for DBMS (out of 100): ");
        int dbmsMarks = scanner.nextInt();

        System.out.println("Enter the marks for Maths (out of 100): ");
        int mathsMarks = scanner.nextInt();

        int totalMarks = javaMarks + pythonMarks + dbmsMarks + mathsMarks;
        System.out.println("Total marks: " + totalMarks);

        double averageMarks = totalMarks / 4.0;
        System.out.println("Average percentage: " + averageMarks + "%");

        char grade = calculateGrade(averageMarks);
        System.out.println("Student Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}