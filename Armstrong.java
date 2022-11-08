import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Armstrong {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number :");
            int n=sc.nextInt();

            int m=n;
            int r;
            int k=0;
            int count=0;

            while(n>0)
            {
                n=n/10;
                count++;
            }

            n=m;
            while(n>0)
            {
                r=n%10;
                n=n/10;
                k+=Math.pow(r, count);
            }

            if(m==k)
            {
                System.out.println("Number is armstrong");
            }
            else
            {
                System.out.println("Number is not a armstrong");
            }
        }
    }
}
