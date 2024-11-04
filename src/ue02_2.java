import java.util.Scanner;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        
        do {
            Out.print("Enter a positive year: ");
            year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("Year must be a positive integer. Please try again.");
            }
        } while (year <= 0);

        do {
            Out.print("Enter a month (1-12): ");
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Month must be between 1 and 12. Please try again.");
            }
        } while (month < 1 || month > 12);

        boolean isLeapYear = false;

        if ((year %4 == 0 && year %100 != 0) || (year %400 == 0)) {
            
            isLeapYear = true;
            
        }
        else{
            isLeapYear = false;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                Out.println("31 Tage");
                break;
            case 4: case 6: case 9: case 11:
                Out.println("30 Tage");
                break;

            case 2:
                if(isLeapYear){
                    Out.println("29 Tage");
                }
                else{
                    Out.println("28 Tage");
                }
                break;
            default:
                System.out.println("Invalid month entered. Please enter a month between 1 and 12.");
        }
          scanner.close();
    }
}
