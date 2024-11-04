import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();
        

        if( x >= 0 && y >= 0)
        {
            if(Math.sqrt((x*x) + (y*y)) > 4) {
                System.out.println("Der Punkt ("+ x +"|"+ y + ") ist außerhalb des Kreises!");

            }
            else {
                System.out.println("Der Punkt ("+ x +"|"+ y + ") ist innerhalb des Kreises!");
            }
        }
        else{
            System.out.println("Der Punkt ("+ x +"|"+ y + ") ist nicht im 1. Quadranten!");
        }


        scanner.close();
    }
}
