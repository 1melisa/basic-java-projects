public class Circle2D {
    double x;
    double y;
    double radius;

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double Get_x() { return x; }
    public double Get_y() { return y; }
    public double Get_radius() { return radius; }
    double getArea(){
        return (Math.PI * (radius * radius));
    }
    double getPerimeter(){
        return (2 * Math.PI * radius);
    }
    boolean contains(double x, double y) {
        double distance = Math.sqrt(((x - Get_x()) * (x - Get_x())) + ((y - Get_y()) * (y - Get_y())));
        if (distance >= Get_radius())
            return false;
        else
            return true;
    }
    boolean contains(Circle2D circle){
        double distance = Math.sqrt(((circle.Get_x() - Get_x()) * (circle.Get_x() - Get_x())) +
                ((circle.Get_y() - Get_y()) * (circle.Get_y() - Get_y())));
        if (distance + circle.Get_radius() <= Get_radius())
            return true;
        else
            return false;
    }
    boolean overlaps(Circle2D circle){
        return !contains(circle);
    }
}
