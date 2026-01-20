package ex13;
class Box2<T>{ //<T> 꺽쇄속의 티는 아무런 대문자 영어면 된다
    T data; //니가 new 할때 결정해라
}
//new 할때 타입을 결정 할 수 있게 해주는 제네릭
public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2(); // <>속에 들어간 타입을 String으로 정해준 상황
        // box2.data=1; 은 불가 왜냐면 직전 줄에서 스트링으로 타입을 결정했으니까
        box2.data="안녕";
        int len = box2.data.length();
        System.out.println(len);

        Box2 <Integer> box3 = new Box2(); //<>안에는 int가 들어갈 수 없음. 래퍼클래스를 적어줘야함
        box3.data = 5;
        System.out.println(box3.data);
    }
}
