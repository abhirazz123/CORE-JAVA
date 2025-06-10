package Assignment.OCt_07;
import java.util.Scanner;

public class DaysToYearsMonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

      
        int years = totalDays / 365;              
        int remainingDays = totalDays % 365;     
        int months = remainingDays / 30;          
        int days = remainingDays % 30;            
       
        System.out.printf("Years: %d%n", years);
        System.out.printf("Months: %d%n", months);
        System.out.printf("Days: %d%n", days);

        scanner.close();
    }
}
