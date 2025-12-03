package ex02;


public class FtoC {
    public static void main(String[] args) {
        //1. 화씨 온도 받기 (캐나다, 미국에서 쓰는 온도 단위 F)
        double f = 100.0;
        //System.out.println(f); //f의 온도가 100.0이 맞는지 확인 해보는 과정
        //2.섭씨온도로 변경하기
        double c = 5.0/9 * (f-32); //변수의 선언! '메모리 c공간에 8바이트 확보해'로 해석 가능
        //System.out.println(f-32);
        //System.out.println(5/9);
        //System.out.println(5/9.0);

        // 3. 출력해서 섭씨온도 확인하기 (37.777777777..)
        System.out.println("섭씨온도는 "+c);

    }
}