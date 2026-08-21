package finalproj;
import java.util.Scanner;
public class BioData_denzel{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            System.out.print("."); //pang loading ng tuldok
            Thread.sleep(500); //
            
        }
        clearScreen();
        System.out.println("=== GAWAN NG BIO-DATA ===");
        
        System.out.print("Pangalan: ");
        String pangalan = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Kasarian (Lalaki/Babae): ");
        String kasarian = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Propesyon/Trabaho: ");
        String trabaho = scanner.nextLine();

        System.out.print("Edukasyon (Pinakamataas na Antas): ");
        String edukasyon = scanner.nextLine();

        // Pag-print ng Bio-Data Format
        System.out.println("\n=================================");
        System.out.println("            BIO-DATA             ");
        System.out.println("=================================");
        System.out.println("Pangalan:    " + pangalan);
        System.out.println("Edad:        " + edad + " taong gulang");
        System.out.println("Kasarian:    " + kasarian);
        System.out.println("Address:     " + address);
        System.out.println("Trabaho:     " + trabaho);
        System.out.println("Edukasyon:   " + edukasyon);
        System.out.println("=================================");
        scanner.close();
        
        System.out.println();
        System.out.println("type previous/next/exit");
        String input = scanner.next();
        switch (input.toLowerCase()) {
            case "previous":
                genave.main(new String[]{});
                break;
            case "next":
                wterms_gumaad.main(new String[]{});
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
