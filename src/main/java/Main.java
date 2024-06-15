import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    methods m = new methods();
    char grade;
    String feedback;
    int average;

    System.out.print("Enter student's name: ");
    String name = input.nextLine();
    System.out.print("Enter student ID: ");
    int StudentID = input.nextInt();
    input.nextLine();

    System.out.print("Enter marks for Math: ");
    int marksMath = input.nextInt();
    input.nextLine();
    System.out.print("Enter marks for Computer Science: ");
    int marksCS = input.nextInt();
    input.nextLine();
    System.out.print("Enter marks for English: ");
    int marksEng = input.nextInt();
    input.nextLine();

    System.out.println("\nCalculating final marks...\n");

    m.setStudentInfo(name, StudentID, marksMath, marksEng, marksCS);
    m.applyBonusMarks();
    m.calculateGrade();

    grade = m.getGrade();
    feedback = m.provideFeedback();
    average = m.getAvg();

    System.out.println("\nAverage Marks: " + average);
    System.out.println("Final Grade: " + grade);
    System.out.println("Feedback: " + feedback);

    input.close();

  }
}
