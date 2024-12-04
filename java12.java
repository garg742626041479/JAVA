import java.util.Scanner;
public class java1 {
    

public class StudentPassFail {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        final int PASS_MARK = 50;
        
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.print("Enter the name of student " + i + ": ");
            String studentName = scanner.nextLine();
            
            
            System.out.print("Enter marks for " + studentName + ": ");
            int marks = scanner.nextInt();
            
            
            if (marks >= PASS_MARK) {
                System.out.println(studentName + " has passed.");
            } else {
                System.out.println(studentName + " has failed.");
            }
            
            
           scanner.nextLine();
        }
    }
}
    }
}
