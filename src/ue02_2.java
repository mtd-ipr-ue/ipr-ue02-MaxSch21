import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        boolean isLeapYear = false;

        if (year %4 == 0 && year %400 == 0) {
            
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

        }
    }
}
