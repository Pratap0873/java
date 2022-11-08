public class IncreaseSize {
    

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,10};
        int b[]=new int[2*a.length];
        // System.out.print(a.hashCode());

        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }

        a=b;
        b=null; 

        System.out.print(a.length);
    }
}
