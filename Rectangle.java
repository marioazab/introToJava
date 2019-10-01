public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles = 0;

    public Rectangle(double w, double h){
        width = w;
        height = h;
        numOfRectangles = numOfRectangles+1;
    }
    public Rectangle(){
        width = 1;
        height = 1;
        numOfRectangles = numOfRectangles+1;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setHeight(double h){
        height = h;
    }
    public static long getNumOfRectangles(){
        return numOfRectangles;
    }
    public double getArea(){
        return width*height;
    }
    public double getCircumference(){
        return (width + height) * 2;
    }
    public boolean isSquare(){
        return width == height;
    }
}
