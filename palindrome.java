import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        

        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a Number");

            int n=sc.nextInt();
            int r;
            int rev=0;
            int m=n;

            while(n>0)
            {
                r=n%10;
                n=n/10;
                rev=rev*10+r;

            }

            if(m==rev)
            {
                System.out.println("Number is palindrome");
            }
            else
            {
                System.out.println("Number is not a palindrome");
            }
        }

    }
    

    
}
