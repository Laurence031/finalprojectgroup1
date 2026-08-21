package finalproj;
import java.util.Scanner;
public class genave {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args)throws InterruptedException{
    try{
        for(int i = 1; i < 5; i++){
            System.out.print(".");      
            Thread.sleep(200);
        }
        clearScreen();
        System.out.println("    Welcome sa Grades Calculator!");
        Thread.sleep(1000);
        System.out.println("Enter Your Grades subjects Below");
        
        Thread.sleep(1500);
        
        double math, Eng, Ap, Mapeh, Fil, tle, sci, esp;
        
          System.out.print("Math: ");
          math = s.nextDouble();
          System.out.print("English: ");
          Eng = s.nextDouble();
          System.out.print("Ap: ");
          Ap = s.nextDouble();
          System.out.print("Mapeh: ");
          Mapeh = s.nextDouble();
          System.out.print("Filipino: ");
          Fil = s.nextDouble();
          System.out.print("TLE: ");
          tle = s.nextDouble();
          System.out.print("Science: ");
          sci = s.nextDouble();
          System.out.print("ESP: ");
          esp = s.nextDouble();
         clearScreen();
        
        double totalsub = math + Eng + Ap + Mapeh + Fil + tle + sci + esp;
        double divide = totalsub / 8;
        System.out.println("Gen average: " + divide);
        System.out.println();
        System.out.println("type main/next/exit");  
        String input = s.next();
        switch (input.toLowerCase()) {
            case "main":
                gradingsys.main(new String[]{});
                break;
            case "next":
                BioData_denzel.main(new String[]{});
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
                System.out.println("Invalid input. Please type 'main' or 'next' or 'exit'.");
                break;
        }
    }
    catch(Exception e){
        System.out.println("Invalid input. Please enter a valid number.");
        main(new String[]{});
    }
    } 
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
