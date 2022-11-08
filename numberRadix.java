import java.util.Scanner;

public class numberRadix {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter Number ");

            String str=sc.nextLine();

            if(str.matches("[01]+"))
            {
                System.out.println("Radix 2");
            }

            else if(str.matches("[0-9]+"))
            {
                System.out.println("Radix 10");
            }

            else if(str.matches("[0-9 A-F]+"))
            {
                System.out.println("Radix 16");
            }
            else if(str.matches("[0-8]+"))
            {
                System.out.println("Radix 8");
            }
            else 
            {
                System.out.println("Invalid Number ");
            }
        }
    }
}
