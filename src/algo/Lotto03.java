package algo;

import java.util.Random;

public class Lotto03 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random(); //자바속 유틸에 있는 랜덤이라는 폴더를 사용하게다
        int [] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2.1 첫번째 추첨 [9 가정][][][][][]
        n = rand.nextInt(2)+1;
        arr[0] = n;

        //2.2 두번째 추첨 [9 가정][15][][][][]
        while (true){
            n = rand.nextInt(2)+1; //<-9
            if (arr[0]!=n) {
                arr[1] = n;
                break;
            }
        }

    }
}
