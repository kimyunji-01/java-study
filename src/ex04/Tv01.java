package ex04;
//코드 해석은 우변(오른쪽)부터
public class Tv01 {
    boolean status = false; // 클래스 기준으로 바로 밑에 적는게 상태

    void on(){
        System.out.println("tv가 켜졌어요");
        status=true; //상태변경
    }


    void off(){
        System.out.println("tv가 꺼졌어요");
        status=false;
    }

    public static void main(String[] args) {
    Tv01 tv = new Tv01(); // 객체(Object) 생성
        System.out.println(tv.status);

        tv.on();
        System.out.println(tv.status);

        tv.off();
        System.out.println(tv.status);


    }
}
