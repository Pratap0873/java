import java.util.Scanner;

public class APSeries {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter starting number : ");
            int a=sc.nextInt();
            System.out.print("Enter number of element : ");
            int n=sc.nextInt();
            System.out.print("Enter difference : ");
            int d=sc.nextInt();

            int term=a;
            for(int i=0;i<n;i++)
            {
                System.out.print(term+" ");
                term+=d;
            }
        }
    }
}
