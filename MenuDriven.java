import java.util.Scanner;

class arr
{
    public int Add(int x, int y)
    {
        return x+y;
    }

    public int sub(int x, int y)
    {
       
        return x-y;
    } 
    public int Mult(int x, int y)
    {
        return x*y;
    }

    public int Div(int x, int y)
    {
        return x/y;
    }
    public int square(int x)
    {
        return x*x;
    }


}


public class MenuDriven {
    

    public static void main(String[] args) {

        arr obj=new arr();

        try(Scanner sc=new Scanner(System.in))
        {   
            System.out.println("------------MENU---------------");
            System.out.println("Enter your Choice ");
            System.out.println("1.Addition");
            System.out.println("2.Substract");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square");

            int option=sc.nextInt();
            int x,y;

            switch(option)
            {
                case 1: System.out.print("Enter two Numbers :");
                        x=sc.nextInt();
                        y=sc.nextInt();
                        System.out.println("Addition of "+ x +" and "+ y +" is "+obj.Add(x, y));

                        break;
                
                case 2: System.out.print("Enter two Numbers :");
                        x=sc.nextInt();
                        y=sc.nextInt();
                        System.out.println("subtraction of "+ x +" and "+ y +" is "+obj.sub(x,y));

                        break;

                case 3: System.out.print("Enter two Numbers :");
                        x=sc.nextInt();
                        y=sc.nextInt();
                        System.out.println("Multiplition of "+ x +" and "+ y +" is "+obj.Mult(x, y));

                        break;

                case 4: System.out.print("Enter two Numbers :");
                        x=sc.nextInt();
                        y=sc.nextInt();
                        System.out.println("Division of "+ x +" By "+ y +" is "+obj.Div(x, y));

                        break;
                case 5: System.out.print("Enter a Number :");
                        x=sc.nextInt();
                        System.out.println("Square of "+ x +" is "+obj.square(x));

                        break;
                default: System.out.println("Invalid Entry");
                        break;
            }

        }
         

    }
}
