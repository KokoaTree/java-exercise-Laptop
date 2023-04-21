package week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
//      (0,0)의 점 찍기
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXY());

//      (1,1) 점 찍기
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("xy가 같은지? %s\n", p2.isSameXY());

        Point p3 = new Point();
        p3.x = 5;
        p3.y = 4;
        System.out.printf("xy가 같은지? %s\n", p3.isSameXY());
    }
}
