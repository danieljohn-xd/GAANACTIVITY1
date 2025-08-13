
package danielgaanact1;

import java.util.Scanner;

public class AirFare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        
        System.out.println("Select Class:");
        System.out.println("1. Economy Class");
        System.out.println("2. Business Class");
        System.out.print("Enter class number: ");
        int travelClass = sc.nextInt();

        
        double baseFarePerKm;
        if (travelClass == 1) {
            baseFarePerKm = 250.0;
        } else if (travelClass == 2) {
            baseFarePerKm = 500.0;
        } else {
            System.out.println("Invalid class selection!");
            sc.close();
            return;
        }

        
        double totalFare = distance * baseFarePerKm;

        
        if (distance > 1000) {
            totalFare *= 0.9; 
        }

       
        System.out.printf("Total fare: %.2f%n", totalFare);

        sc.close();
    }
}  
    
    
    
