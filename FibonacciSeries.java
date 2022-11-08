import java.util.Scanner;

public class FibonacciSeries {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t1=0;
        int t2=1;
        int t3;



        System.out.print("Enter Number of element wan't : ");
        int n=sc.nextInt();

        System.out.print(t1+" "+t2+" ");


        for(int i=2;i<n;i++)
        {
            t3=t1+t2;
            System.out.print(t3+" ");
            
            t1=t2;
            t2=t3;
        }


    }
}
