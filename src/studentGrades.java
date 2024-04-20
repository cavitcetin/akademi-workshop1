import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Her öğrenci için bilgilerin saklanacağı diziler
        String[] studentNames = new String[numberOfStudents];
        String[] studentLastNames = new String[numberOfStudents];
        double[][] examScores = new double[numberOfStudents][3]; // Her öğrenci için 3 sınav notu

        // Her öğrenci için bilgileri al
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter information for student " + (i + 1) + ":");
            System.out.print("Student name: ");
            studentNames[i] = scanner.next();
            System.out.print("Student last name: ");
            studentLastNames[i] = scanner.next();
            System.out.print("Exam 1 score: ");
            examScores[i][0] = scanner.nextDouble();
            System.out.print("Exam 2 score: ");
            examScores[i][1] = scanner.nextDouble();
            System.out.print("Exam 3 score: ");
            examScores[i][2] = scanner.nextDouble();
        }

        // Her öğrencinin not ortalamasını hesapla ve ekrana yazdır
        System.out.println("\nStudent grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            double average = (examScores[i][0] + examScores[i][1] + examScores[i][2]) / 3;
            System.out.println("Student " + (i + 1) + ": " + studentNames[i] + " " + studentLastNames[i] + ", Average: " + average);
        }

        scanner.close();
    }
}
