/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.test;

/**
 *
 * @author Lisakhanya
 */
public class GamingConsoleReport {
    

    public static void main(String[] args) {
   
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};


        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Gaming Console Report
        
        System.out.println("Gaming Console Report");
      
       
        // Print header row
        System.out.printf("%-18s%-10s%-10s%-10s%n", "", consoles[0], consoles[1], consoles[2]);

        // Print table body
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-10d%-10d%-10d%n",
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("   Console sales totals for each city");
  

        int maxSales = -1;
        String topCity = "";

        // Calculate and print totals for each city
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s%-10d%n", cities[i], cityTotal);

            // Track city with maximum sales
            
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        // Top City
        System.out.println("City with the most sake" + topCity);
       
    }
}

