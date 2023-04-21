package week1.day5;

public class SpaceInvaderMemberVariiable {
    int location; // 멤버변수

    public void moveLeft() {
        location = location - 1;

    }
    public void moveLeftAndPrint() {
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        location = location + 1;
    }

    public void moveRightAndPrint() {
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariiable simv = new SpaceInvaderMemberVariiable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d\n", simv.location);

        simv.moveLeft();
        System.out.printf("최종 위치: %d", simv.location);
    }
}
