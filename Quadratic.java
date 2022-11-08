import java.util.Scanner;

public class Quadratic {
    
    public static void main(String[] args) {
        
        try(Scanner s=new Scanner( System.in))
        {

            int a,b,c;
            System.out.println("Enter the Cefficients :");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();

            double r1,r2;

            r1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
            r2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

            System.out.println("roots of Equation are : "+ r1+" and "+r2);


        }
    }
}
