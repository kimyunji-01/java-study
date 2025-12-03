package ex04;

//OOP:Object Oriented Programing
//1원칙 : 상태는 행위를 통해 변경한다.
// 상태에는 private를 붙인다 => 상태에 직접 접근 하지 못하게하여 행위로만 상태를 변경할 수 있게 히도록 하기위해

public class PeopleApp {
    public static void main(String[] args) {
        People people1 = new People("홍길동",30,5);
        People people2 = new People("장보고",20,3);

        people1.밥먹기();//메서드임 => 힙의 상태를 변경 시키기 때문에!
        people1.밥먹기();//메서드임 => 힙의 상태를 변경 시키기 때문에!
        System.out.println(people1.getWeight());
    }
}
