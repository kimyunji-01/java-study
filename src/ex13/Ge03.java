package ex13;

/*
Object로 설계할 수 밖에 없는 이유
new의 제어권이 내가 아닌 사용자에게 있는 경우
 */

import java.io.StringBufferInputStream;

class 서랍{ //미리 떠있어야함 <= 남이 미리 만들어둠 나는 이제 채우넣는 입장
    Object data;

  public static 서랍 instance= new 서랍(); //static때문에 한번뜰 수 있음

    private 서랍(){

    }

}

public class Ge03 {
    public static void main(String[] args) {
    서랍 s = 서랍.instance; //남이 만들어준 object를 쓸때 호출 문법
        s.data = "안녕";

        //다운캐스팅
        String castData = (String)s.data;
        int len = castData.length();
        System.out.println(len);
    }
}
