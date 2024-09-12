import java.rmi.registry.Registry;

public class Rectangle{
    // attributes
    // - private + public
    private float length ;
    private float width ;
    // constructor
    //1. default constructor is only accessible when you don't have your own constructor defined
    //2. no argument constructor
    public Rectangle()
    {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    //3. parametrised constructor
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }




    //methods
 
    public float getLength()
    {
        return this.length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getWidth()
    {
       return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea()
    {
        return (this.length * this.width);
    }

    public double getPerimeter() 
    {
        return (2 * (this.length + this.width));
    }

    public String toString()
    {
        return("Rectangle = (" + this.length + " , " + this.width + ")"); 
    }

}