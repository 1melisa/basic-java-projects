public class Q1 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("The area is: " +c1.getArea());
        System.out.println("The perimeter is: " +c1.getPerimeter());
        System.out.println("Is the point (3,3) inside of the circle?: " + c1.contains(3,3));
        System.out.println("Is the circle with x = 4, y = 5 and radius = 10.5 inside of the circle?: "
                + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Is the circle with x = 3, y = 5 and radius = 2.3 overlap with the circle?: "
                + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
