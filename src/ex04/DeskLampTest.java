package ex04;

public class DeskLampTest {
    public static void main(String[] args) {

        DeskLamp myLamp = new DeskLamp(); // 객체 생성을 위한 new

        myLamp.turnOn(); //객체 메소드 호출을 위해 도트연산자인 .을 사용
        System.out.println(myLamp);
        myLamp.turnOff();
        System.out.println(myLamp);

    }
}
