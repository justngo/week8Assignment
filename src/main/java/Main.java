import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Enter your name: ");
    String name = input.nextLine();
    System.out.println("Enter your Student ID: ");
    int StudentID = input.nextInt();
    input.nextLine();
    
    System.out.println("Enter the marks for your first subject: ");
    int marks1 = input.nextInt();
    input.nextLine();
    System.out.println("Enter the marks for your second subject: ");
    int marks2 = input.nextInt();
    input.nextLine();
    System.out.println("Enter the marks for your third subject: ");
    int marks3 = input.nextInt();
    input.nextLine();

    int bonusMark1 = rand.nextInt(6);
    int bonusMark2 = rand.nextInt(6);
    int bonusMark3 = rand.nextInt(6);

    if(marks1 + bonusMark1 > 100) {
      marks1 = 100;
    } else {
      marks1 = marks1 + bonusMark1;
    }

    if(marks2 + bonusMark2 > 100) {
      marks2 = 100;
    } else {
      marks2 = marks2 + bonusMark2;
    }

    if(marks3 + bonusMark3 > 100) {
      marks3 = 100;
    } else {
      marks3 = marks3 + bonusMark1;
    }

    int average = 
  }

}