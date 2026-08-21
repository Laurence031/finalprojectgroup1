package finalproj;
import java.util.Scanner;
public class BMI {
   private static final Scanner sc = new Scanner(System.in);
   private static final BMI Calculatorfordash = null;
  
    public static void main(String[] args)throws InterruptedException{
        
        System.out.println();
        System.out.println("=== BMI ===");
        System.out.println();
        
        System.out.print("Enter your Weight : ");
        double weight = sc.nextDouble();
        System.out.println();
        
        System.out.print("Enter your Height : ");
        double height = sc.nextDouble();
        System.out.println();
        
        if (height >= 3.0) {
            height = height / 100;
        }
        
        double bmi = weight / (height * height);
        System.out.println("BMI = " + String.format("%.2f", + bmi));
        
        if (bmi <= 0 || bmi > 100) {
            System.out.println("Invalid BMI!");
        } else if (bmi < 18.5) {
            System.out.println("You're Underweight!");
        } else if (bmi <= 24.9) {
            System.out.println("Youre very healthy man!");
        } else if (bmi <= 29.9) {
            System.out.println("You're very big ya know?!");
        }
            System.out.println();
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
    }
        public static void clearScreen() {  // pang clear ng mga previous output
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}