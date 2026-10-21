import static java.lang.Math.sqrt;

public class Point {
    int x;
    int y;

    double distance(Point otherPoint){
        double dist = sqrt((otherPoint.x - this.x)*(otherPoint.x - this.x) + (otherPoint.y - this.y)*(otherPoint.y - this.y));
        return dist;
    }
}
