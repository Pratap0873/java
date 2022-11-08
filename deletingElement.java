import java.util.Scanner;

public class deletingElement {
    

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter Number to delete :");
            int n=sc.nextInt();
            int a[]={2,4,6,8,10,12};

            int i;

            for(i=0;i<a.length;i++)
            {
                if(a[i]==n)
                {
                    break;
                }
            }

            for(int j=i;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }

            for(int k=0;k<a.length-1;k++)
            {
                System.out.print(a[k]+" ");
            }
        }
    }
}
