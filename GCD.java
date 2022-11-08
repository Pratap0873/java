import java.util.Scanner;

public class GCD {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter the Numbers :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int m=a,n=b;


            while(a!=b)
            {
                if(a>b)
                {
                    a-=b;
                }
                else
                {
                    b-=a;
                }
            }


            System.out.print("Greatest common divisor of "+m+" and "+ n+" is "+ a);
        }
    }
}
