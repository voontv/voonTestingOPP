import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public Shape shape;
    public ShapeFactory(String parameters) {
        List<Integer> integerList = getListIntegerFromParameters(parameters);
        int count = integerList.size();
        if (count == 3) {
            this.shape = new Circle(integerList.get(0), integerList.get(1), integerList.get(2));
        } else if (count == 6) {
            this.shape = new TriangleShape(integerList.get(0), integerList.get(1), integerList.get(2), integerList.get(3), integerList.get(4), integerList.get(5));
        } else if (count == 8) {
            this.shape = new Quadrilateral(integerList.get(0), integerList.get(1), integerList.get(2), integerList.get(3), integerList.get(4), integerList.get(5), integerList.get(6), integerList.get(7));
        } else {
            throw new RuntimeException("Don't same request");
        }
    }

    public String showInfo() {
        return shape.showInfo();
    }

    public double getArea() {
        return shape.getArea();
    }

    public double getPerimeter() {
        return shape.getPerimeter();
    }

    public static List<Integer> getListIntegerFromParameters(String input){
        int count =0;
        List<Integer> list = new ArrayList<>();
        for(String str: input.trim().split(" ")) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }
}
