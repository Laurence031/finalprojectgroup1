package finalproj;
import java.util.Scanner;
public class Calculatorfordash {

 public static void clearScreen() {  // pang clear ng mga previous output
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
  //Oprators ng calculator, dito kukunin, i r-return sa switch
    public static double add(double a, double b)
    {
        return a + b;
    }
    public static double minus(double a, double b)
    {
        return a - b;
    }
    public static double multiply(double a, double b)
    {
        return a * b;
    }
    public static double div(double a, double b)
    {
        if(a == 0 && b == 0)
        {
            System.out.println("Cannot divide sa zero");
            return Double.NaN;
        } return a / b;
    }
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            
            for(int i = 0; i < 5; i++)
        {
            System.out.print("."); //pang loading ng tuldok
            Thread.sleep(500); //
            
        }
        clearScreen();
        
        String hellouser = BernersDashboard.usernamein;
        System.out.println("Hello " + hellouser + "!");
        
        System.out.println("Welcum sa calculator:)");
        System.out.print("Loading Resources");
        
        for(int i = 0; i < 5; i++)

        {
            System.out.print("."); //pang loading ng tuldok
            Thread.sleep(500); //
            
        }
        System.out.println();
        clearScreen();
            System.out.print("Let me know what you want to calculate?: ");
             
            //pang space, pang palit ng x value ng multip
            String input = scanner.nextLine().replace("x", "*").trim();
            
            
            //para mahati ang numbers sa operator
            String[] numerop = input.split("(?<=[+\\-*x/])|(?=[+\\-*x/])");
           
            if (numerop.length == 0 || input.length() == 0) {
                System.out.println("Error: Empty input.");
                return;
            }
           // int[] pangalan = {1, +, 1, +, 1, +, 1, +, 1};
 //{"1", "+", "1", "+", "1", "+", "1", "+", "1"}
 //  0    1    2    3    4    5    6    7    8
            // unang number 
            double num1 = Double.parseDouble(numerop[0]);
            double result = 0; //result
           
//1 + 1 + ?=
            //para sa operator
            for (int i = 1; i < numerop.length; i += 2) {
                // pang salo ng error kapag 1 + 1 + ?
                if (i + 1 > numerop.length) { 
                    System.out.println("Error: Incomplete expression. Missing a final number.");
                    return;
                }
                // value; condition; updation
            
             //67 + 67
             // 0 1 2 index ni i + 1
             //2 + 2
             //0 1 2 input ni user
                String operator = numerop[i]; 
                //pangalawang number at sa mga susunod.........
                double nextNumber = Double.parseDouble(numerop[i + 1]);

                
                switch (operator) {
                    case "+":
                        result = add(num1, nextNumber); //result = num1 + nextNumber
                        break;
                    case "-":   
                        result = minus(num1, nextNumber); // para sa minus, gagamitin ang add method na may negative value
                        break;
                    case "*":
                        result = multiply(num1, nextNumber); // para sa multiply, gagamitin ang add method na may 0 value
                        break;
                    case "/":
                        if (nextNumber == 0) {
                            System.out.println("Error: Division by zero.");
                            return;
                        }
                        result = div(num1, nextNumber);
                        break;
                    default:
                        System.out.println("Error: Unknown operator '" + operator + "'");
                        return;
                }
               //  num1 = result; // pag store ng result sa num1 para ma update sya sa totoong result
            }

            System.out.printf("Result: %.2f%n", result);

            System.out.println();
        System.out.println("type main/next/exit");  
        String input1= scanner.next();
        switch (input1.toLowerCase()) {
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

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Ensure inputs are separated by spaces.");
        }
        
    }
}