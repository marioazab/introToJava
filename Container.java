import java.awt.*;

public class Container {
    private Rectangle rectangle;
    private Circle circle;

    public Rectangle getRectangle() {
        return rectangle;
    }
    public Circle getCircle(){
        return circle;
    }
    public void setRectangle(Rectangle r){
        rectangle = r;
    }
    public void setCircle(Circle c){
        circle = c;
    }

    public int size() {
        int num = 2;
        if (rectangle == null) {
            num = num - 1;
        }
        if (circle == null) {
             num = num - 1;
        }
        return num;
    }
}
