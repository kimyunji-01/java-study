package algo;

import java.util.Random;

public class Lotto04 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random(); //자바속 유틸에 있는 랜덤이라는 폴더를 사용하게다
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2.1 첫번째 추첨 [9 가정][][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45) + 1;
           if (!isSame){
                arr[0]= n;
                break;
            }
        }

        //9,15,15,15,20
        //2.2 두번째 추첨 [9 가정][15][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45) + 1;
            if (arr[0] == n) {
                isSame = true;
            }
            if (!isSame){
                arr[1]= n;
                break;
            }
        }


        //2.3 세번째 추첨 [9 가정][15 가정][20 가정][][][]


        while(true){
            boolean isSame = false;
            n = rand.nextInt(45) + 1;
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n){
                isSame = true;
            }
            if (!isSame){
                arr[2]= n;
                break;
            }
        }
        //2.4번째 추첨 [9 가정][15 가정][20 가정][39 가정][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45) + 1;
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n){
                isSame = true;
            }
            if (arr[2] == n){
                isSame = true;
            }
            if (!isSame){
                arr[3]= n;
                break;
            }
        }
        //2.5번째 추첨 [9 가정][15 가정][20 가정][39 가정][40 가정][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45) + 1;
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n){
                isSame = true;
            }
            if (arr[2] == n){
                isSame = true;
            }
            if (arr[3] == n){
                isSame = true;
            }
            if (!isSame){
                arr[4]= n;
                break;
            }
        }
        //2.6번째 추첨 [9 가정][15 가정][20 가정][39 가정][40 가정][]
        int i = 0;
        while(true){

            boolean isSame = false;
            n = rand.nextInt(45) + 1;
            if (arr[i] == n) {
                isSame = true;
            }
            if (arr[1] == n){
                isSame = true;
            }
            if (arr[2] == n){
                isSame = true;
            }
            if (arr[3] == n){
                isSame = true;
            }
            if (arr[4] == n){
                isSame = true;
            }
            if (!isSame){
                arr[5]= n;
                break;
            }
        }

     }
}

