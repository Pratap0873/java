public class rightRotate {
    

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,1,0};

        int temp=a[a.length-1];

        for(int x: a)
        {
            System.out.print(x+" ");
        }

        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];
        }

        a[0]=temp;

        System.out.println();
        for (int x : a) {
            System.out.print(x+" ");
        }

    }
}
