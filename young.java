import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class young {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter your age ");
            int age=sc.nextInt();

            if(age<14)
            {
                System.out.println("Your are kid ");
            }
            else if (age>=14 && age<=55)
            {
                System.out.println("You are young");
            }
            else 
            {
                System.out.println("You are old");
            }
        }
    }
}
