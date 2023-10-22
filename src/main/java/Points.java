import java.awt.Point;
import java.util.ArrayList;

public class Points {
    public ArrayList<Point> points;

    public Points () {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point p){
        points.add(p);
    }

    public boolean pointExists(int x, int y) {
        for(int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            if (point.x == x && point.y == y) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Points pointsObj = new Points();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        pointsObj.addPoint(point1);
        pointsObj.addPoint(point2);

        System.out.println("Does point (1, 2) exist? " + pointsObj.pointExists(1, 2));
        System.out.println("Does point (3, 4) exist? " + pointsObj.pointExists(3, 4));
        System.out.println("Does point (5, 6) exist? " + pointsObj.pointExists(5, 6));
    }
}
