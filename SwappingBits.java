import java.util.Scanner;

class SwappingBits
{
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            int a,b;

            System.out.println("Enter two numbers :");
            a=sc.nextInt();
            b=sc.nextInt();

            a=a^b;
            b=a^b;
            a=a^b;

            System.out.println("a = "+a+" b = "+b);
        }
    }
}