/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.test;
import java.util.Scanner;

/**
 *
 * @author Lisakhanya
 */
public class RunConsoleSales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Select Console Type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown Console";
                break;
        }

        // Enter store name and total number of sales
        
        System.out.print("Enter Store Name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter Total Sales Amount: ");
        double totalSales = scanner.nextDouble();

      
        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);
        System.out.println();
        report.printReport();

        scanner.close();
    }
}
    

