public class seconfLargest {
    

    public static void main(String[] args) {
        
        int a[]={5,3,56,1,3,5,656,2};

        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max2;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2)
            {
                max2=a[i];
            }
            else if(a[i]>max3)
            {
                max3=a[i];
            }
        }

        System.out.print("Second largest elements is : "+max3);
    }
}
