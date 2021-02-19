public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //public, protected, default
    //private -> error
    protected double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

}
