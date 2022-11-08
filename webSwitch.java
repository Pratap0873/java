import java.text.BreakIterator;
import java.util.Scanner;

class webSwitch
{
    public static void main(String[] args) {
        
        try (Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter URL");
            
            String web=sc.nextLine();

            String type=web.substring(web.lastIndexOf(".")+1);

            switch(type)
            {
                case "com": System.out.println("Commercial");
                            break;
                case "org": System.out.println("Organization");
                            break;
                case "gov": System.out.println("government");
                            break;
                case "net": System.out.println("Network");
                            break;
                default: System.out.println("Invalid");
                            break;
            }
        }
    }
}