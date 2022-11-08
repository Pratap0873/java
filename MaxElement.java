public class MaxElement {
    
    public static void main(String[] args) {
        
        int a[]={85,6,2,9,94,34,313,5};

        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.print("Max number is : "+max);
    }
}
