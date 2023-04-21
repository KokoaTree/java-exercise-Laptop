package week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXY() {
        return x == y;
    }

    double getDistance(Point p2) {
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }

}
