import java.util.Scanner;

public class Multiplication {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            int r1,r2,c1,c2;
            System.out.println("Enter dimensions of first matrix : ");
            r1=sc.nextInt();
            c1=sc.nextInt();
            System.out.println("Enter the dimensions of second matrix :");
            r2=sc.nextInt();
            c2=sc.nextInt();
            int a[][]=new int[r1][c1];
            int b[][]=new int [r2][c2];


            if(c1!=r2)
            {
                System.out.println("Can't multiply");
                return;
            }

            else
            {

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

                int c[][]=new int[r1][c2];

            

                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        c[i][j]=0;
                        for(int k=0;k<r2;k++)
                        {
                            c[i][j]+=a[i][k]*b[k][j];
                        }
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
}

