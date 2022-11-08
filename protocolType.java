import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class protocolType {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter URL");
            String web=sc.nextLine();

            String protocol=web.substring(0, web.indexOf(":"));

            String webtype=web.substring((web.lastIndexOf(".")+1));

            //protocol
            System.out.print("Protocol : ");
            if(protocol.equals("http"))
            {
                System.out.println("hyper text tansfer protocol");
            }
            else if(protocol.equals("ftp"))
            {
                System.out.println("file transfer protocol");
            }
            else if(protocol.equals("https"))
            {
                System.out.println("hypertext transfer protocol secure");
            }
            else 
            {
                System.out.println("Invalid");
            }

            //type
            System.out.print("Website type : ");

            if(webtype.equals("org"))
            {
                System.out.println("Organization");
            }
            else if(webtype.equals("com"))
            {
                System.out.println("Commercial");
            }
            else if(webtype.equals("gov"))
            {
                System.out.println("government");
            }
            else if(webtype.equals("net"))
            {
                System.out.println("Network");
            }
            else 
            {
                System.out.println("Invalid");
            }



        }

        


        
    }
}
