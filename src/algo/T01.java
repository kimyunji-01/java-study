package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오
 * (1) 비지니스
 * (2) 샘플링
 * (3) 노가다
 * (4) 패턴찾기
 *
 */

public class T01 {
    public static void main(String[] args) {

        //1-100중의 2의 배수는 2*1~50

        int num = 2;
        int sub = 1;

        int[] arr = new int[50];


        for (int i = 0; i < 50; i++) {
            int answer = num * sub;
            sub++;
            arr[i] = answer;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();






//                2*2;
////            2*3;
////            2*4;
////            2*5;
////            2*6;
////            2*7;
////            2*8;
////            2*9;
////            2*10;


    }
}
