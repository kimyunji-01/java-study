package ex06.game;

public class MyHash03 {
    public static void main(String[] args) {
       char[] arr = {'A','B','C'};
        int h = 0;

        //스탭 1 = 문자를 숫자로 바꾼다
        int n = arr[0]; //문자를 int로 바꾸면 자동으로 형변환이 된다 65
        h= h * 31 + n; //65 앞에 변수가 바뀌면 뒤에 나오는 변수의 값도 바뀐다

        //스텝 2
        n = arr[1];
        h = h*31+n; // h= 2081

        //스텝 2
        n = arr[2];
        h = h*31+n; // h= 2081
        System.out.println(h);
    }

}
