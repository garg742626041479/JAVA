import java.util.Scanner;
public class java1 {
   

    public class LeapYearCheck {
        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
    
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
    }
}
