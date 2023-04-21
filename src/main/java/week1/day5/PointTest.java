package week1.day5;

import java.nio.channels.Pipe;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
//      (0,0)의 점 찍기
        p1.x = 0;
        p1.y = 0;
        System.out.printf("(%d,%d)\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXY());

//      (1,1) 점 찍기
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("(%d,%d)\n", p2.x, p2.y);
        System.out.printf("xy가 같은지? %s\n", p2.isSameXY());

        Point p3 = new Point();
        p3.x = 5;
        p3.y = 4;
        System.out.printf("(%d,%d)\n", p3.x, p3.y);
        System.out.printf("xy가 같은지? %s\n", p3.isSameXY());

        Point p4 = new Point();
        p4.x = 7;
        p4.y = 1;
        System.out.printf("(%d,%d)\n", p4.x, p4.y);
        System.out.printf("xy가 같은지? %s\n", p4.isSameXY());

        Point p5 = new Point();
        p5.x = 9;
        p5.y = 9;
        System.out.printf("(%d,%d)\n", p5.x, p5.y);
        System.out.printf("xy가 같은지? %s\n", p5.isSameXY());
    }
}
