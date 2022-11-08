import javax.sound.midi.SysexMessage;
import java.lang.*;

public class swapReverse {
    
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14};
        int temp;

        for(int i=0,j=a.length-1;i<Math.ceil((a.length)/2);i++,j--)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        for(int x: a)
        {
            System.out.print(x+" ");
        }
    }

    
}
