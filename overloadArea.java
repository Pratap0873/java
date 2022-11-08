import java.util.DuplicateFormatFlagsException;

class areaofshape 
{
    // triangle
    double area(double l, double b)
    {
        return l*b;
    }

    //circle
    double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    //trapizium

    double area(double l,double b, double h)
    {
        return 0.5*(l+b)*h;
    }
}


public class overloadArea {
    
    public static void main(String[] args) {
        
        areaofshape a=new areaofshape();

        System.out.print("Area : "+a.area(4,5,9));
    }
}
