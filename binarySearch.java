public class binarySearch {
    

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,10,12};

        int find=63;
        int l=0;
        int h=a.length-1;
        int mid;

        while(l<h)
        {
            mid=(l+h)/2;

            if(a[mid]==find)
            {
                System.out.print("Found ");
                return;
            }
            else
            {
                if(a[mid]<find)
                {
                    
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }

        }

        System.out.println("Not found ");
    }
}
