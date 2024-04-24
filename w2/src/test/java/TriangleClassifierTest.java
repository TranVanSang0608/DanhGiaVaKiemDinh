import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    void testEquilateralTriangle() {
        String result = TriangleClassifier.classifyTriangle(3, 3, 3);
        assertEquals("Equilateral", result);
    }

    @Test
    void testIsoscelesTriangle() {
        String result = TriangleClassifier.classifyTriangle(3, 3, 4);
        assertEquals("Isosceles", result);
    }

    @Test
    void testScaleneTriangle() {
        String result = TriangleClassifier.classifyTriangle(3, 4, 5);
        assertEquals("Scalene", result);
    }

    @Test
    void testNotATriangle() {
        String result = TriangleClassifier.classifyTriangle(1, 2, 5);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testInvalidInput_NegativeSide() {
        String result = TriangleClassifier.classifyTriangle(-1, 2, 3);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testInvalidInput_ZeroSide() {
        String result = TriangleClassifier.classifyTriangle(0, 2, 3);
        assertEquals("NotATriangle", result);
    }
}