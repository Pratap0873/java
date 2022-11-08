import java.lang.reflect.Array;

class reverseno
{
    int reverse(int n)
    {
        int num=0;
        int r;

        while(n!=0)
        {
            r=n%10;
            n=n/10;

            num=num*10+r;

        }

        return num;
    }

    int [] reverse(int a[])
    {
        for(int i=0,j=a.length-1;i<Math.ceil(a.length/2);i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        return a;
    }
}



public class overloadReverse {
    

    public static void main(String[] args) {
        
        reverseno a=new reverseno();

        int arr[]={2,4,6,8};
        a.reverse(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        int n=234;
        System.out.println(a.reverse(n));

    }
}
