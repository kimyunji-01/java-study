package exam;

public class ReverseStarPractice {
    public static void main(String[] args) {
        //3행! space 2개, star 1개
        //4행! space 3개, star 1개
        //5행! space 4개, star 1개

        String space = " ";
        String star = "*";
        int row =10;
        int n1 = row-1;
        int n2 = 1;

        for (int k = 0; k < row; k++) //별 만들기 모듈을 돌리는 FOR구문
        {
            //1행
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--; //2부터 시작했으니까 여기에
            n2++;
        }





    }
}
