package finalproj;
import java.util.Scanner;
public class BernersDashboard {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{

        String credentials[] = SignIn();
         String fname = credentials[0];
        String password = credentials[1];

       
       for (int i = 0; i < 5; i++)
        {
            System.out.print("."); //pang loading ng tuldok
            Thread.sleep(200); //
            
        }
        clearScreen();
        System.out.println("Account Successfully Registered!\n Mag log in ka na!"); 
        
        
        boolean login = false;
        int attempts = 0;
        while(!login)
        {
           System.out.println("\n--- LOG IN YOUR ACCOUNT! ---");
            System.out.print("Enter Your Name: ");
           String userinputname = s.nextLine();
           System.out.print("Enter Your Password: ");
            String userinputpassword = s.nextLine();
            
            login = loginconfirmed(userinputname, userinputpassword, fname, password);  // kinoll si log in  confirmed para ma check kung equas ba sila 

            
            if (!login)
                System.out.println("Invalid Username or password mo!");
            attempts++;
            
            if (attempts == 3)
            {
                System.out.println("Too Many Attempts!\nTry again Later.");
                break;
                
            }
            clearScreen();
            if(login){
                System.out.print("Loading Resources");
                for(int dot = 0; dot < 5;dot++){
                    System.out.print(".");
                    Thread.sleep(200);
                }
                clearScreen();
                mainmenu(); //tinawag si mainmenu para magamit ang application
            
            }
        }
    }
    public static boolean loginconfirmed(String username, String password, String regusername, String reguserpass)throws InterruptedException
    {
        return username.equals(regusername) && password.equals(reguserpass);
    }
    public static String usernamein = "?";

    
    public static String[] SignIn() throws InterruptedException
    {
        System.out.println("Hello Berners!");
        System.out.print("Loading Resources");
        for(int i = 0; i < 5; i++)
        {
            System.out.print("."); //pang loading ng tuldok
            Thread.sleep(500);
            
        
        }
        
        System.out.println("\n");
        System.out.println("Mag Sign Up ka na!\n");
        System.out.println("Press any key to continue...");
        s.nextLine();
        clearScreen();
        System.out.print("Enter Your Name: ");
        String name = s.nextLine(); 
        System.out.print("Create a password: "); 
        String password = s.nextLine();
        usernamein = name;
        return new String[]{name, password};

        
        
    }
    public static void mainmenu()throws InterruptedException{
        while(true){
            System.out.println("===Welcome to BernersLee App===");
            while(true){
                Thread.sleep(100);
            System.out.println("Ilagay ang number ng pipiliin");
            Thread.sleep(100);
            System.out.println("[1] Calculator");
            Thread.sleep(100);
            System.out.println("[2] BMI Calculator");
            Thread.sleep(100);
            System.out.println("[3] Grading System");
            Thread.sleep(100);
            System.out.println("[4] General Average");
            Thread.sleep(100);
            System.out.println("[5] Bio Data Templating");
            Thread.sleep(100);
            System.out.println("[6] Whole Term Grade Calculator");
            System.out.println("[7] Exit");
            
            int menu = s.nextInt();
            
            switch (menu){
                case 1:
                Calculatorfordash.main(new String[]{});
                break;
                case 2:
                BMI.main(new String[]{});
                break;
                case 3:
                gradingsys.main(new String[]{});
                break;
                case 4: 
                genave.main(new String[]{});
                break;
                case 5:
                BioData_denzel.main(new String[]{});
                break;
                case 6:
                wterms_gumaad.main(new String[]{});
                break;
                case 7:
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
                break;
                default:
                System.out.println("1-5 numbers only");
                break;
            //  case 7:
        //      BernersDashboard.motor(new String[]{});
        //      break;
            } 
            break;
             }break;
        }
    }
    public static void clearScreen() {  // pang clear ng mga previous output
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

// public class BernersDashboard {
//    public static VOID main(String[] args) throws InterruptedException{
//}