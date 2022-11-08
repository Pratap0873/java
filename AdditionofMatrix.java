import java.util.Scanner;

public class AdditionofMatrix {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the dimension of matrix : ");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int [m][n];
            int b[][]=new int [m][n];

            System.out.println("Enter elements of first matrix : ");

            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    System.out.print("Enter a["+i+"]"+"["+j+"]"+ " elemet : ");
                    a[i][j]=sc.nextInt();
                }
            }


            System.out.println("Enter elements of second matrix : ");

            for(int i=0;i<b.length;i++)
            {
                for(int j=0;j<b[0].length;j++)
                {
                    System.out.print("Enter b["+i+"]"+"["+j+"]"+ " elemet : ");
                    b[i][j]=sc.nextInt();
                }
            }

            int c[][]=new int [m][n];

            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }

            for(int x[]: c)
            {
                for(int y:x)
                {
                    System.out.print(y+" ");
                }

                System.out.println();
            }




        }
    }
}
