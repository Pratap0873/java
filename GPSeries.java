import java.util.Scanner;

public class GPSeries {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter first term : ");
            int a=sc.nextInt();
            System.out.print("Enter common ratio : ");
            int r=sc.nextInt();

            System.out.print("Enter Number of elements : ");
            int n=sc.nextInt();


            int term=a;

            for(int i=0;i<n;i++)
            {
                System.out.print(term+" ");
                term*=r;
            }
        }
    }
}
