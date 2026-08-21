package finalproj;
import java.util.Scanner;
public class gradingsys{
        public static void clearScreen() {  // pang clear ng mga previous output
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
       private static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{
    
       
        for(int i = 1; i < 5; i++){
            System.out.print(".");
            Thread.sleep(200);
        }
        clearScreen();
        double A1, A2, A3, A4, A5;      // for activities
        double Ass1, Ass2, Ass3;        // for assignments
        double Q1, Q2, Q3, Q4, Q5;      // for quizzes
        double FinalExam;
        
        
        System.out.println("===Grade System Calculator===");

        System.out.println("Activities");

        System.out.print("Act1: ");
        A1 = s.nextDouble();

        System.out.print("Act2: ");
        A2 = s.nextDouble();

        System.out.print("Act3: ");
        A3 = s.nextDouble();

        System.out.print("Act4: ");
        A4 = s.nextDouble();

        System.out.print("Act5: ");
        A5 = s.nextDouble();

        // Calculator for activities
        double actadd = A1 + A2 + A3 + A4 + A5;
        double Actdiv = (actadd / 100) * 100;

        System.out.println("Total Act: " + Actdiv);

        System.out.println("Assignments");

        System.out.print("Ass1: ");
        Ass1 = s.nextDouble();

        System.out.print("Ass2: ");
        Ass2 = s.nextDouble();

        System.out.print("Ass3: ");
        Ass3 = s.nextDouble();

        double assadd = Ass1 + Ass2 + Ass3;
        double assdiv = (assadd / 30) * 100;

        System.out.println("Assignment total: " + assdiv);

        System.out.println("Quizzes");

        System.out.print("Q1: ");
        Q1 = s.nextDouble();

        System.out.print("Q2: ");
        Q2 = s.nextDouble();

        System.out.print("Q3: ");
        Q3 = s.nextDouble();

        System.out.print("Q4: ");
        Q4 = s.nextDouble();

        System.out.print("Q5: ");
        Q5 = s.nextDouble();

        double Qadd = Q1 + Q2 + Q3 + Q4 + Q5;
        double Qdiv = (Qadd / 50) * 100;

        System.out.println("Quiz total: " + Qdiv);

        System.out.print("Final Exam: ");
        FinalExam = s.nextDouble();

        double Fequations = (FinalExam / 50) * 100;

        System.out.println("Final Exam total: " + Fequations);

        double Activities = Actdiv * 0.25;
        double Assignments = assdiv * 0.20;
        double Quizzes = Qdiv * 0.25;
        double Final = Fequations * 0.30;

        double overalltotal = Activities + Assignments + Quizzes + Final;

        System.out.println("The total is: " + overalltotal);
        System.out.println();
        System.out.println("type previous/next/exit");
        String input = s.next();
        switch (input.toLowerCase()) {
            case "previous":
                BMI.main(new String[]{});
                break;
            case "next":
                genave.main(new String[]{});
                break;
            case "exit":
                Thread.sleep(100);
                System.out.print("Exiting the program...");
                for(int i = 0; i < 5; i++)
                {
                    System.out.print("."); //pang loading ng tuldok
                    Thread.sleep(500); //
                    
                }
                clearScreen();
                Thread.sleep(100);
                System.out.println("Thank you for using BernersLee App!");
            default:
                System.out.println("Invalid input. Please type 'previous' or 'next' or 'exit'.");
                break;
        }
    }
}
