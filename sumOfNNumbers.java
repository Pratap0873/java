import java.util.Scanner;

public class sumOfNNumbers {
    
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number :");
            int n=sc.nextInt();

            int sum=0;

            for(int i=1;i<=n;i++)
            {
                sum+=i;
            }

            System.out.println("Sum of first "+n+" Naturak numbers is "+ sum);
        }
    }
}

