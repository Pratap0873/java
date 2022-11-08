import java.util.Scanner;

class oddOrEven
{
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number ");

            int a=sc.nextInt();

            if(a%2==0)
            {
                System.out.println("Number is even");
            }

            else
            {
                System.out.println("Number is odd ");
            }
        }
    }
}