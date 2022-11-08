import java.util.Scanner;

public class digitsofNo {
    
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number ");
            int n=sc.nextInt();

            int r;

            while(n>0)
            {
                r=n%10;
                n=n/10;

                System.out.println(r);
            }
        }
    }
}
