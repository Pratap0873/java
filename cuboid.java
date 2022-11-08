import java.util.Scanner;

public class cuboid {
    
    public static void main(String[] args) {
        
        try(Scanner s=new Scanner(System.in))
        {
            int l,b,h;
            System.out.println("Enter the Dimensions of Cuboid :");
            l=s.nextInt();
            b=s.nextInt();
            h=s.nextInt();

            double area,volume,perimeter;

            area=(2*l*b)+(2*b*h)+(2*h*l);
            volume=l*b*h;
            perimeter=2*(l+b);

            System.out.println("Area of cuboid :"+ area);
            System.out.println("volume of cuboid :"+ volume);
            System.out.println("perimeter of cuboid :"+ perimeter);

        
        
        
        }
    }
}
