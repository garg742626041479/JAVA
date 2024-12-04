import java.util.Scanner;
public class java1 {
    

public class MonthOfYear {
    public static void main(String[] args) {
        
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

       
        if (monthNumber >= 1 && monthNumber <= 12) {
            
            System.out.println("The month is: " + months[monthNumber - 1]);
        } else {
           
            System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        }
    }
}
    }
}
