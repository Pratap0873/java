import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number ");
            int n=sc.nextInt();
            int f=1;

            for(int i=n;i>0;i--)
            {
                f*=i;
            }

           

            System.out.println(f);
        }
    }
}
