import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("X-Koordinate:");
        double x = scanner.nextDouble();
        System.out.println("Y-Koordinate:");
        double y = scanner.nextDouble();


        if(x >= 0 && y >= 0 && x <= 4 && y <= 4)
        {
            if(Math.sqrt((x*x) + (y*y)) > 4) {
                System.out.println("Der Punkt ("+ x +"|"+ y + ") ist innerhalb der grünen Fläche!");
            }
            else {
                System.out.println("Der Punkt liegt im Kreis!");
            }
        }
        else{
            System.out.println("Der Punkt liegt außerhalb des Kreises und der grünen Fläche!");
        }
        
        scanner.close();
    }
}
