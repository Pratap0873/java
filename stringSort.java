public class stringSort {
    

    public static void main(String[] args) {
        
        String arr[]={"java","python","ada","pascal","basic"};

        java.util.Arrays.sort(arr);
        
        for(String x:arr)
        {
            System.out.print(x+" ");
        }

    }    
}
