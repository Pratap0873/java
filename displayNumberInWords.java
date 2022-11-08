import java.util.Scanner;

public class displayNumberInWords {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a number ");
            int n=sc.nextInt();
            
            int r=0;
            String rev="";

            while(n>0)
            {
                r=n%10;
                n=n/10;
                rev=rev+r;


            }
            r=0;



            for(int i=rev.length()-1;i>=0;i--)
            {
                char a=rev.charAt(i);

                switch(a)
                {
                    case '0': System.out.print("Zero ");
                            break;

                    case '1': System.out.print("One ");
                            break;
                    case '2': System.out.print("two ");
                            break;
                    case '3': System.out.print("three ");
                            break;
                    case '4': System.out.print("four ");
                            break;
                    case '5': System.out.print("five ");
                            break;
                    case '6': System.out.print("six ");
                            break;
                    case '7': System.out.print("seven ");
                            break;
                    case '8': System.out.print("eight ");
                            break;
                    case '9': System.out.print("nine ");
                            break;
                    
                    default: System.out.print("Invalid ");
                            break;


                }
            }
        }
    }
}
