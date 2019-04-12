public class Circle implements Shape {

    private int circleR;
    private int circleX;
    private int circleY;

    public Circle(int circleX, int circleY, int circleR) {
        this.circleR = circleR;
        this.circleX = circleX;
        this.circleY = circleY;
    }

    public String showInfo() {
        return "This is Circle";
    }

    public double getArea() {
        return Math.PI * circleR * circleR;
    }
    public double getPerimeter() {
        return  2 * Math.PI * circleR;
    }
}
