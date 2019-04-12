import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class StrategyShapeTest {

    @Test
    public void testcreatedObjectwithParameters() {
        StrategyShape strategyShape = new StrategyShape();
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);

// do your thing

// optionally, reset System.in to its original
        System.setIn(System.in);
    }
}
