public class leftRotate {
    

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,1,0};

        int temp=a[0];

        for(int x: a)
        {
            System.out.print(x+" ");
        }

        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }

        a[a.length-1]=temp;

        System.out.println();
        for (int x : a) {
            System.out.print(x+" ");
        }

    }
}
