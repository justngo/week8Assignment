import java.util.Random;

public class methods {
  Random rand = new Random();
  private String name;
  private int StudentID;
  private int markMath;
  private int markEnglish;
  private int markComSci;
  private String feedback;
  private char grade;
  private int average;

  public void setStudentInfo(String nameIn, int studIDIn, int markMathIn, int markEnglishIn, int markComSciIn) {
    name= nameIn;
    StudentID = studIDIn;
    markMath = markMathIn;
    markEnglish = markEnglishIn;
    markComSci = markComSciIn;    
  }

  public void applyBonusMarks() {
    int bonusMath = rand.nextInt(6);
    int bonusEng = rand.nextInt(6);
    int bonusCS = rand.nextInt(6);

    if (markMath + bonusMath > 100) {
      markMath = 100;
    } else {
      markMath = markMath + bonusMath;
    }

    if (markEnglish + bonusEng > 100) {
      markEnglish = 100;
    } else {
      markEnglish = markEnglish + bonusEng;
    }

    if (markComSci + bonusCS > 100) {
      markComSci = 100;
    } else {
      markComSci = markComSci + bonusCS;
    }

    System.out.println("Math (after bonus): " + markMath);
    System.out.println("Computer Science (after bonus): " + markComSci);
    System.out.println("English (after bonus): " + markEnglish);
  }

  public void calculateGrade() {
    average = (markComSci + markEnglish + markMath) / 3;

    if (average >= 90) {
      grade = 'A';
    } else if (average >= 80 && average < 90) {
      grade = 'B';
    } else if (average >= 70 && average < 80) {
      grade = 'C';
    } else if (average >= 60 && average < 70) {
      grade = 'D';
    } else if (average < 60) {
      grade = 'F';
    }
  }

  public String provideFeedback() {
    switch(grade) {
      case 'A':
        feedback = "Excellent";
        break;
      case 'B':
        feedback = "Good";
        break;
      case 'C':
        feedback = "Satisfactory";
        break;
      case 'D':
        feedback = "Needs Improvement";
        break;
      case 'F':
        feedback = "Fail";
        break;
    }
    return(feedback);
  }

  public char getGrade() {
    return grade;
  }

  public int getAvg() {
    return average;
  }
}