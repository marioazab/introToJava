public class Circle {
    private static double radius;
    private String color;
    private static long numOfCircles;
    public static final double PI = Math.PI;
    public Circle(String c){
        radius = 1.0;
        color = c;
        numOfCircles = numOfCircles + 1;
    }

    public Circle(String c, double r){
        radius = r;
        color = c;
        numOfCircles = numOfCircles + 1;
    }

    public double getRadius() {
        return radius;
    }
    public void setColor(String c) {
        color = c;
    }
    public String getColor(){
        return color;
    }
    public static long getNumOfCircles(){
        return numOfCircles;
    }
    public static double getArea(){
        double circleArea = PI*(radius*radius);
        return circleArea;
    }
    public static double getCircum(){
        double circleCircum = 2*PI*radius;
        return circleCircum;
    }
}
