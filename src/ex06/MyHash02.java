package ex06;

public class MyHash02 {
    public static void main(String[] args) {
        char c = 'A'; //2바이트를
        System.out.println(c);
        byte b = (byte)c; // 1바이트에 다운캐스팅 해서 집어넣음
        System.out.println(b); // 출력값은 65, 이 65는 아스키코드에서 A를 나타냄

        byte b1 = 65;
        char c1 = (char) b1;
        System.out.println(c1);
    }
}
