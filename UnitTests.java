import java.util.Enumeration;

public class UnitTests {
    public static void UnitTests() {
        assert Circle.getNumOfCircles() == 0;
        assert Rectangle.getNumOfRectangles() == 0;

        Circle firstCircle = new Circle("red");

        assert Circle.getNumOfCircles() == 1;
        assert firstCircle.getRadius() == 1.0;
        assert firstCircle.getColor().equals("red");

        Circle secondCircle = new Circle("blue", 2.0);
        assert Circle.getNumOfCircles() == 2;
        assert secondCircle.getRadius() == 2.0;
        assert secondCircle.getColor().equals("blue");
        secondCircle.setColor("yellow");
        assert secondCircle.getColor().equals("yellow");
        assert secondCircle.getArea() == 4.0 * Math.PI;
        assert secondCircle.getCircum() == 4.0 * Math.PI;

        Rectangle firstRectangle = new Rectangle(2.0,2.0);
        assert Rectangle.getNumOfRectangles() == 1;
        assert firstRectangle.getHeight() == 2;
        assert firstRectangle.getWidth() == 2;
        firstRectangle.setHeight(3.0);
        assert firstRectangle.getHeight() == 3.0;
        assert firstRectangle.isSquare() == false;
        firstRectangle.setWidth(3.0);
        assert firstRectangle.getWidth() == 3.0;
        assert firstRectangle.isSquare() == true;
        assert firstRectangle.getArea() == 9.0;
        assert firstRectangle.getCircumference() == 12.0;

        Rectangle secondRectangle = new Rectangle();
        assert secondRectangle.getWidth() == 1.0;
        assert secondRectangle.getHeight() ==1.0;
        assert Rectangle.getNumOfRectangles() == 2;

        Container container = new Container();
        assert container.getCircle() == null;
        assert container.getRectangle() == null;
        assert container.size()== 0;

        container.setCircle(firstCircle);
        assert container.getCircle() != null;
        assert container.size() == 1;

        container.setRectangle(firstRectangle);
        assert container.getRectangle() != null;
        assert container.size() == 2;

        container.setCircle(null);
        assert container.size() == 1;


    }

    public static void main(String[] args) {
        UnitTests.UnitTests();
    }
}
