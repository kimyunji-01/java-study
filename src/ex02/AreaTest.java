package ex02;

public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double radius, area;

        radius = 5.0;
        area = PI* radius * radius;
        System.out.println("반지름의 5인 원의 면적은"+ area);
    }
}
