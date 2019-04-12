import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrategyShape {

    public static ArrayList<Shape> shapeArrayList = new ArrayList<>();
    public static void main(String[] args) {
        StrategyShape strategyShape = new StrategyShape();
        List<String> stringLis = new ArrayList<>();
        //int n = scanner.nextInt();

    }

    public ArrayList<Shape> createdObjectwithParameters(int n) {
        Scanner scanner = new Scanner((System.in));

        for(int i =0; i<n; i++) {
            String parameters = scanner.nextLine();
            System.out.println("parameters "+parameters);
            ShapeFactory shapeFactory = new ShapeFactory(parameters);
            shapeArrayList.add(shapeFactory.shape);
        }
        return shapeArrayList;
    }
}
