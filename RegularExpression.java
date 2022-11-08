import java.util.Scanner;

// import java.util.Scanner;

// public class RegularExpression {
    
//     public static void main(String[] args) {
        
//         try(Scanner sc=new Scanner(System.in))
//         {
//             String str=sc.nextLine();

//             boolean a=str.matches("[01]+");

//             if(a==true)
//             {
//                 System.out.println("Number is binary");
//             }
//             else
//             {
//                 System.out.println("Number is not binary");

//             }

//             String str2=sc.nextLine();

//             boolean b=str2.matches("[0-9 a-f A-F]+");

//             if(b==true)
//             {
//                 System.out.println("Number is hexadecimal");
//             }
//             else
//             {
//                 System.out.println("Number is not hexadecimal");

//             }


//             String str3=sc.nextLine();

//             // boolean c=str3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
//             boolean c=str3.matches("[1-31]/[1-12]/[0-9]{4}");

//             if(c==true)
//             {
//                 System.out.println("Right format");
//             }
//             else
//             {
//                 System.out.println("Invalid format");

//             }

//         }
        


//     }
// }




class RegularExpression
{
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            String str=sc.nextLine();

            str=str.replaceAll("\\s+", " ").trim();

            String words[]=str.split("\\s");
            System.out.println(words.length);
        }
    }
}
