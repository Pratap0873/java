import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

// import java.util.*;

// class area
// {
//     public static void main(String[] args) {
//         try (Scanner s = new Scanner(System.in)) {
//             int b,h;

//             float area;
            
//             System.out.println("Enter base and Height ");
//             b=s.nextInt();
//             h=s.nextInt();

//             area=(b*h)/2;

//             System.out.println("Area of a given Triangle is "+ area);
//         }
//     }
// }




class area
{
    public static void main(String[] args) {
        
        try(Scanner s =new Scanner(System.in))
        {
            int a ,b,c;
            float Si,area;

            System.out.println("Enter the sides of Triangle ");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();

            Si=(a+b+c)/2f;

            area=(float)Math.sqrt(Si*(Si-a)*(Si-b)*(Si-c));

            System.out.println("Area of Triangle is "+ area);


        }
    }
}