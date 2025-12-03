package algo;

/** 12의 약수를 찾으시오
 * 1.비지니스의 이해 (12를 1~12까지 나눠서 맞아 떨어지면 약수)
 * 2.샘플링 6의 약수 구하기
 * 3.노가다
 * 4.패턴 찾기
 */


public class Divisor01 {

    public static void main(String[] args) {
        int num = 1;
        String result ="맞음";

        for (int i = 0; i < 6; i++) {
            if (6%num==0){
                result = "맞음";
            }else{
                result = "틀림";
            }
            System.out.println(num + "은 약수 " + result);
            num++;
        }




    }
}
