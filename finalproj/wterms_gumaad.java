package finalproj;
import java.util.Scanner;
public class wterms_gumaad {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "Gumaad";
        String correctPassword = "12321";

        System.out.println("Please Log In");

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {

            System.out.println("Login Successful!");
            System.out.println("____________________");

            System.out.println("");
            System.out.println(" 1ST TERM ");
            System.out.println("");

            System.out.print("Activity 1 (10): ");
            double a1 = sc.nextDouble();

            System.out.print("Activity 2 (10): ");
            double a2 = sc.nextDouble();

            System.out.print("Activity 3 (10): ");
            double a3 = sc.nextDouble();

            double activity1 = ((a1 + a2 + a3) / 30) * 20;

            System.out.print("Quiz 1 (10): ");
            double q1 = sc.nextDouble();

            System.out.print("Quiz 2 (10): ");
            double q2 = sc.nextDouble();

            System.out.print("Quiz 3 (10): ");
            double q3 = sc.nextDouble();

            System.out.print("Quiz 4 (10): ");
            double q4 = sc.nextDouble();

            System.out.print("Quiz 5 (10): ");
            double q5 = sc.nextDouble();

            double quiz1 = ((q1 + q2 + q3 + q4 + q5) / 50) * 20;

            System.out.print("Final Project (50): ");
            double project1 = sc.nextDouble();
            double projectScore1 = (project1 / 50) * 30;
            
            System.out.print("Final Exam (50): ");
            double exam1 = sc.nextDouble();
            double examScore1 = (exam1 / 50) * 30;

            double firstTerm = activity1 + quiz1 + projectScore1 + examScore1;

            System.out.println("1st Term Grade: " + firstTerm);

            System.out.println("");
            System.out.println(" 2ND TERM ");
            System.out.println("");

            System.out.print("Activity 1 (10): ");
            a1 = sc.nextDouble();

            System.out.print("Activity 2 (10): ");
            a2 = sc.nextDouble();

            System.out.print("Activity 3 (10): ");
            a3 = sc.nextDouble();

            double activity2 = ((a1 + a2 + a3) / 30) * 20;

            System.out.print("Quiz 1 (10): ");
            q1 = sc.nextDouble();

            System.out.print("Quiz 2 (10): ");
            q2 = sc.nextDouble();

            System.out.print("Quiz 3 (10): ");
            q3 = sc.nextDouble();

            System.out.print("Quiz 4 (10): ");
            q4 = sc.nextDouble();

            System.out.print("Quiz 5 (10): ");
            q5 = sc.nextDouble();

            double quiz2 = ((q1 + q2 + q3 + q4 + q5) / 50) * 20;

            System.out.print("Final Project (50): ");
            project1 = sc.nextDouble();
            double projectScore2 = (project1 / 50) * 30;

            System.out.print("Final Exam (50): ");
            exam1 = sc.nextDouble();
            double examScore2 = (exam1 / 50) * 30;

            double secondTerm = activity2 + quiz2 + projectScore2 + examScore2;

            System.out.println("2nd Term Grade: " + secondTerm);

            System.out.println("");
            System.out.println(" 3RD TERM ");
            System.out.println("");

            System.out.print("Activity 1 (10): ");
            a1 = sc.nextDouble();

            System.out.print("Activity 2 (10): ");
            a2 = sc.nextDouble();

            System.out.print("Activity 3 (10): ");
            a3 = sc.nextDouble();

            double activity3 = ((a1 + a2 + a3) / 30) * 20;

            System.out.print("Quiz 1 (10): ");
            q1 = sc.nextDouble();

            System.out.print("Quiz 2 (10): ");
            q2 = sc.nextDouble();

            System.out.print("Quiz 3 (10): ");
            q3 = sc.nextDouble();

            System.out.print("Quiz 4 (10): ");
            q4 = sc.nextDouble();

            System.out.print("Quiz 5 (10): ");
            q5 = sc.nextDouble();

            double quiz3 = ((q1 + q2 + q3 + q4 + q5) / 50) * 20;

            System.out.print("Final Project (50): ");
            project1 = sc.nextDouble();
            double projectScore3 = (project1 / 50) * 30;

            System.out.print("Final Exam (50): ");
            exam1 = sc.nextDouble();
            double examScore3 = (exam1 / 50) * 30;

            double thirdTerm = activity3 + quiz3 + projectScore3 + examScore3;

            System.out.println("3rd Term Grade: " + thirdTerm);

            double finalGrade = (firstTerm * 0.30)
                    + (secondTerm * 0.30)
                    + (thirdTerm * 0.40);

            System.out.println("___________________");
            System.out.printf("Final Grade: ", finalGrade);


            if (finalGrade >= 90 && finalGrade <= 99) {
                System.out.println("Class A");
            } else if (finalGrade >= 80) {
                System.out.println("Class B");
            } else if (finalGrade >= 75) {
                System.out.println("Class C");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println(" Invalid Username or Password! ");
        }

        System.out.println();
        System.out.println("type previous/next/exit");
        String input = sc.next();
        switch (input.toLowerCase()) {
            case "previous":
                Calculatorfordash.main(new String[]{});
                break;
            case "next":
                gradingsys.main(new String[]{});
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
        sc.close();
    }
    public static void clearScreen() {  // pang clear ng mga previous output
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}