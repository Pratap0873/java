import java.security.AllPermission;
import java.util.Scanner;

public class insertion {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter Number to insert : ");
            int n=sc.nextInt();

            System.out.print("Enter index at which to insert : ");
            int index=sc.nextInt();

    
            int a[]=new int[6];
            a[0]=2;
            a[1]=4;
            a[2]=8;
            a[3]=10;
            a[4]=12;

            int last=4;



            int i;
            for(i=last+1;i>index;i--)
            {
                a[i]=a[i-1];
            }
            a[index]=n;

            for(int x:a)
            {
                System.out.print(x+" ");
            }
        }
    }
}
