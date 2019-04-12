import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {

    @Test
    public void test_ShapeFactory() {
        ShapeFactory shapeFactory = new ShapeFactory("3 4 5");
        assertEquals(shapeFactory.shape.showInfo(),"This is Circle");

        shapeFactory = new ShapeFactory("3 4 5 8 9 10");
        assertEquals(shapeFactory.shape.showInfo(),"This is Triangle");

        shapeFactory = new ShapeFactory("3 4 5 8 9 10 9 9");
        assertEquals(shapeFactory.shape.showInfo(),"This is Quadrilateral");
    }

    @Test(expected = RuntimeException.class)
    public void test_ShapeFactoryRuntimeException() {
        ShapeFactory shapeFactory = new ShapeFactory("3 4 5 6");
    }

    @Test
    public void test_showInfo() {
        ShapeFactory shapeFactory = new ShapeFactory("2 4 5 -1 -4 7");
        assertEquals(shapeFactory.showInfo(),"This is Triangle");
    }

    @Test
    public void test_getPerimeter() {
        ShapeFactory shapeFactory = new ShapeFactory("2 4 5 -1 -4 7");
        assertEquals(shapeFactory.getPerimeter(),23.19481603796878,0.001);
    }

    @Test
    public void test_getArea() {
        ShapeFactory shapeFactory = new ShapeFactory("2 4 5 -1 -4 7");
        assertEquals(shapeFactory.getArea(),12.5,0.001);
    }
}
