package danielgaanact1;

import java.util.Scanner;

public class Activity1 {

   
    public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            String name;
            int subjects;
            float gsub, total = 1;
            System.out.print("Enter student name:");
            name = sc.nextLine();
            
            System.out.print("Enter number of students:");
            subjects = sc.nextInt();
            
            System.out.print("Enter grade for subject 1:");
            gsub = sc.nextInt();
            
            
            
            for(int i = 1; i <= subjects; i++){
                System.out.print("Enter grade for subject"+ i +":");
                gsub = sc.nextFloat();
                total += gsub;
            }     
   
            double average = total / subjects;
            
            System.out.printf("\nAverage: %.2f\n", average);
            
            if (average >= 75) {
                System.out.print("Remarks: PASSED");
            } else {
                System.out.print("Remarks: FAILED");
            }
            
            sc.close();
            
    }
}