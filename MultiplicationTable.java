import java.util.Scanner;

public class MultiplicationTable {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Number ");
            int n=sc.nextInt();

            System.out.println("Table of "+ n+"is :");

            for(int i=1;i<=10;i++)
            {
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }
    }
}
