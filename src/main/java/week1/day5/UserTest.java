package week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User Taehwan = new User();
        Taehwan.name = "김태환";
        Taehwan.phoneNumber = "010-0000-0000";
        Taehwan.age = 28;

        User gildong = new User();
        gildong.name = "홍길동";
        gildong.phoneNumber = "010-0000-0000";
        gildong.age = 31;

        System.out.printf("%s님은 성인입니까? 나이가 %d이므로 %s\n", Taehwan.name, Taehwan.age, Taehwan.isAdult());
        System.out.printf("%s님은 성인입니까? 나이가 %d이므로 %s\n", gildong.name, gildong.age, gildong.isAdult());

    }
}
