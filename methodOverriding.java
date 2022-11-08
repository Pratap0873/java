class superclass
{
    public void display()
    {
        System.out.println("Superclass ");
    }

}


class subclass extends superclass
{
    public void display()
    {
        System.out.println("Subclass ");
    }

    public void call()
    {
        System.out.println("Call");
    }

}



class methodOverriding
{
    public static void main(String[] args) {
        
        // superclass su=new superclass();
        // su.display();

        // subclass sb=new subclass();
        // sb.display();

        superclass su=new subclass();
        su.call();

    }

}