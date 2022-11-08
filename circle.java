class cir 
{
    private double radius;

    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

class circle
{
    public static void main(String[] args) {
        
        cir c=new cir();

        cir c1[];

        c.setRadius(7);

        System.out.println("Radius "+c.getRadius());
        System.out.println("Area "+ c.area());
        System.out.println("perimeter "+c.perimeter());
        System.out.println("circumference "+c.circumference());

    }
}