import java.util.Scanner;

class foreachLoop
{
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            
            System.out.print("Enter Number of elements in array : ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter elements :");

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }

            System.out.println("Numbers are ::");

            for(int x:a)
            {
                x=x*2;
                System.out.print(x+" ");
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }

        }
    }
}