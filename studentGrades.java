import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class studentGrades {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter pcm marks ");
            int p=sc.nextInt();
            int c=sc.nextInt();
            int m=sc.nextInt();

            float average=(p+c+m)/3;
            System.out.print("Your grade is : ");
            if(average>=70)
            {
                System.out.println("A");
            }

            else if(average>=60 && average<70)
            {
                System.out.println("B");
            }
            else if(average>=50 && average<60)
            {
                System.out.println("C");
            }
            else if(average>=40 && average<50)
            {
                System.out.println("D");
            }
            else 
            {
                System.out.println("F");
            }
        }
    }
}
