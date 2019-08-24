package Hrostmann.ch02;

public class point {
    private double x;
    private double y;

    private point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    static point NewPoint (double x, double y)
    {
        return new point(x,y);
    }

    static point NewPoint ()
    {
        return NewPoint(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public point translate(double x,double y)
    {
        return NewPoint(x+this.x,y+this.y);
    }

    public point scale(double scale)
    {
        return NewPoint(scale*this.x,scale*this.y);
    }
}
