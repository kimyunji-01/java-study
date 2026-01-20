package ex16;



public class Th02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

        });

        t1.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("서브 스레드 : "+i);
        }
    }
}
