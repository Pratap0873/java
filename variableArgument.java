// class vari 
// {
//     int max(int ... a)
//     {
//         if(a.length==0)
//         {
//             return Integer.MIN_VALUE;
//         }

//         int m=a[0];
//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i]>m)
//             {
//                 m=a[i];
//             }
//         }

//         return m;
//     }
// }


// public class variableArgument {
//     public static void main(String[] args) {
        
//         System.out.print("Max number is "+ new vari().max(5,9,3));
//     }
// }




// sum of elements

// class vari 
// {
//     int sum(int ... a)
//     {
//         int s=0;
//         for(int i=0;i<a.length;i++)
//         {
//             s+=a[i];
//         }

//         return s;
//     }
// }


// class variableArgument
// {
//     public static void main(String[] args) {
        
//         System.out.println("Sum is : "+ new vari().sum(1,2,3,4,5,96,562,66,1234));
//     }

// }



class disc
{
    double discount(double ... p)
    {
        double sum=0;
        double price=0;
        for(int i=0;i<p.length;i++)
        {
            sum+=p[i];
        }

        price=sum;

        if(sum>=5000)
        {
            price=sum-(sum*(15/100));
        }
        else if(sum>=3000 && sum<5000)
        {
            price =sum-(sum*(10/100));
        }
        else if(sum>=1000 && sum<3000)
        {
            price=sum-(sum*(5/100));
        }

        return price;
    }
}

class variableArgument
{
    public static void main(String[] args) {
        
        System.out.print("Amount to pay : "+new disc().discount(123,896,931,1238,936));
    }
}