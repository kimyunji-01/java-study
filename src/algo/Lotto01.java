package algo;

import java.util.Random;

public class Lotto01 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random(); //자바속 유틸에 있는 랜덤이라는 폴더를 사용하게다
        int [] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2.1 첫번째 추첨 [9 가정][][][][][]
        n = rand.nextInt(45)+1;
        arr[0] = n;

        //2.2 두번째 추첨 [9 가정][15 가정][][][][]
        n = rand.nextInt(45)+1;
        arr[1] = n;

        //2.3 세번째 추첨 [9 가정][15 가정][20 가정][][][]
        n = rand.nextInt(45)+1;
        arr[2] = n;

        //2.4 세번째 추첨 [9 가정][15 가정][20 가정][30 가정][][]
        n = rand.nextInt(45)+1;
        arr[3] = n;

        //2.5 세번째 추첨 [9 가정][15 가정][20 가정][30 가정][40 가정][]
        n = rand.nextInt(45)+1;
        arr[4] = n;

        //2.6 세번째 추첨 [9 가정][15 가정][20 가정][30 가정][40 가정][43 가정]
        n = rand.nextInt(45)+1;
        arr[5] = n;
    }
}
