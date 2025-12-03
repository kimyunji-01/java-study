package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오
 * (1) 비지니스
 * (2) 샘플링
 * (3) 노가다
 * (4) 패턴찾기
 *
 */

public class T01Teacher {
    public static void main(String[] args) {
        int n = 1;
        String result = "아닙니다.";


        for (int i = 0; i < 100; i++)//여기 들어가는 i는 걍 돌리는 용도라 수정 할 필요 없음
        {

            if (n % 2 == 0) { //*2
                result = "맞습니다.";
            } else {
                result = "아닙니다."; //굳이 맞는 결과의 예외값을 지정 해줄 필요 없음
            }
            System.out.println(n + "은 2의 배수가" + result);
            n++;
        }
    }
}

