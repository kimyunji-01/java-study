package exam;

public class OneToTenSum {
    public static void main(String[] args) {

        //누적식 *중요!!  (sum++, sum = sum+1)
//  처음에 감이 안잡힐때는 아래처럼
//        sum=sum+1;
//        sum=sum+2;
//        sum=sum+3;
//        sum=sum+4;
//        sum=sum+5;
//        sum=sum+6;
//        sum=sum+7;
//        sum=sum+8;
//        sum=sum+9;
//        sum=sum+10;
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("1부터 10까지의 정수의 합="+sum);

    }
}
