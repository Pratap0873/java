public class linearSearch {
    

    public static void main(String[] args) {
        int a[]={2,4,6,8,1,3,8};

        int find=89;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==find)
            {
                System.out.print("Found ");
                return;
            }
        }

        System.out.print("Not found ");
    }

 
}
