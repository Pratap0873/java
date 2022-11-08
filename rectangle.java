import java.io.ObjectInputStream.GetField;
import java.util.logging.LogRecord;

class rec 
{
    private double length,breadth;

    public void setLength(double length)
    {
        this.length=length;
    }

    public void setBreadth(double breadth)
    {
        this.breadth=breadth;
    }

    public double getLength()
    {
        return length;
    }

    
    public double getBreadth()
    {
        return breadth;
    }
        
    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }
}


public class rectangle {

    public static void main(String[] args) {
        
        rec r=new rec();

        r.setLength(5);
        r.setBreadth(6);

        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth : "+r.getBreadth());
        System.out.println("Area : "+r.area());
        System.out.println("perimeter : "+r.perimeter());

    }
    


}
