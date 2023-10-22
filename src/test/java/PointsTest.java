import java.awt.Point;

public class PointsTest {
    public static void main(String[] args) {
        Points pointsObj = new Points();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        pointsObj.addPoint(point1);

        // Test 1: Check if point (1, 2) exists
        assert pointsObj.pointExists(1, 2);

        // Test 2: Check if point (3, 4) exists
        assert !pointsObj.pointExists(3, 4);

        // Test 3: Check if point (5, 6) exists
        assert !pointsObj.pointExists(5, 6);

        pointsObj.addPoint(point2);

        // Test 4: Check if point (3, 4) exists after adding it
        assert pointsObj.pointExists(3, 4);
    }
}


