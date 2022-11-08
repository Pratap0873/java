import java.util.Scanner;

public class reverse {
    
    public static void main(String[] args) {
        
        try(Scanner s =new Scanner(System.in))
        {
            System.out.print("Enter the number :");
            int n;
            n=s.nextInt();

            int ans=0;
            int original;
            original=n;

            int remainder;

            while(n!=0)
            {
                remainder=n%10;
                ans=ans*10+remainder;
                n=n/10;
            }

            System.out.println("The reverse of "+original +" is "+ans);




            
            

        }
    }
}
