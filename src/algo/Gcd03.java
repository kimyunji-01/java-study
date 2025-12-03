package algo;

/**
 * 01.6의 약수를 구하고,8의 약수를 구해서 최대 공약수를 찾아라
 * 1. 비지니스 이해 => (6을 1~6까지 나눠서 떨어지는 약수 - 배열에 담기)
 * 2.                (6을 1~6까지 나눠서 떨어지는 약수 - 배열에 담기)
 * 3. arr1 = [1,2,3,6]
 * 4. arr2 = [1,2,4,8]
 * 5. 두배열을 비교해서 최대공약수 찾기
 * 후보 1 -> 2 int result에 담기
 */

public class Gcd03 {

    static void 약수구하기(int a){
        int[] arr1 = new int[a];
        int n1 = 0; // n1은 인덱스 번호값
        int k1 = 1;
        for (int i = 0; i < a; i++) {

        }
        if (a % k1 == 0) {
            arr1[n1] = k1;
            n1++;
        }
        k1++;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[] arr1 = new int[6]; //[1][2][3][6][0][0]
        int[] arr2 = new int[8]; // [1][2][4][8][0][0][0][0]


        //1.6의 약수 채우기 =====================================================

        //6을 1로 나눠서 나누어 떨어지면 arr0 번지에 1을 넣겠다


        // 8

        int n2 = 0; // n1은 인덱스 번호값
        int k2 = 1;



        //3.최대공약수 구하기
        int result = 0;
        int c =0;

        for (int i = 0; i < 4; i++) {
            if (arr1[c] == arr2[0]) result = arr1[c];
            if (arr1[c] == arr2[1]) result = arr1[c];
            if (arr1[c] == arr2[2]) result = arr1[c];
            if (arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }
        System.out.println("최대공약수는 ="+result);
    }
}
