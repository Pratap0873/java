import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.w3c.dom.views.DocumentView;

class cylinder 
{
    private double radius,height;


    public cylinder()
    {
        setRadius(1);
        setHeight(1);
    }

    public cylinder(int r)
    {
        setRadius(r);
        setHeight(1);
    }

    public cylinder(int r,int h)
    {
        setRadius(r);
        setHeight(h);
    }

    public void setRadius(int r)
    {
        if(r>=0)
        {
            radius=r;
        }
        else
        {
            radius=0;
        }
    }
    public void setHeight(int h)
    {
        if(h>=0)
        {
            height=h;
        }
        else
        {
            height=0;
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public double getHeight()
    {
        return height;
    }

    public double lidArea()
    {
        return Math.PI*Math.sqrt(getRadius());
    }

    public double totalSurfaceArea()
    {
        return circumference()*height+2*lidArea();
    }

    public double circumference()
    {
        return 2*Math.PI*getRadius();
    }
}


public class cylinderConstructor {

    public static void main(String[] args) {
        
        cylinder c1=new cylinder();

        System.out.printf("Lid area %6.2f :\n ",c1.lidArea());
        System.out.printf("total surface area %6.2f : \n",c1.totalSurfaceArea());
        System.out.printf("circumference %6.2f : \n",c1.circumference());

    }
}

