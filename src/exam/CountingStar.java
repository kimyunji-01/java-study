package exam;

public class CountingStar {
    public static void main(String[] args) {

//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
//        int a = 0;
//
//        // 별1
//        a++;
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        // 별2
//        a++;
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        // 별3
//        a++;
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        // 별4
//        a++;
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        // 별5
//        a++;
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        *****
//        ****
//        ***
//        **
//        *
        String star ="*";
        int c =5;
        int row = 5;

        for (int k = 0; k < row; k++) { //위에 for 구문의 k값과 안에 들어있는 for구문의 i 값의 이름이 달라야함
            for (int i = 0; i < c; i++) {
                System.out.print(star); // ctrl + d 행복사
            }
            System.out.println();
            c--;

        }


    }
}
