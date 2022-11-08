import java.util.Scanner;

public class digitCount {
    
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number ");
            int n=sc.nextInt();

            int r;
            int count=0;

            while(n>0)
            {
                // r=n%10;
                n=n/10;
                count++;

                // System.out.println(r);
            }

            System.out.println("Number of digits "+count);
        }
    }
}
