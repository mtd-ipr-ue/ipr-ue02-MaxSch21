import java.util.Scanner;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        Out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        Out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3){
            Out.println(num1 +" is the biggest Number!");
        }
        if(num2 > num1 && num2 > num3){
            Out.println(num2 +" is the biggest Number!");
        }
        if(num3 > num1 && num3 > num2){
            Out.println(num3 +" is the biggest Number!");
        }
        else {
            Out.println("There is no biggest number!");
        }
        
        scanner.close();
    }
}
