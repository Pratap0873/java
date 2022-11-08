public class copyingArray {
    

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,10,12};

        int b[]=new int [6];

        int i=0;
        for(;i<6;i++)
        {
            b[i]=a[i];
        }

        for(int x: b)
        {
            System.out.print(x+" ");
        }
    }
}
