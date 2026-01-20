package ex07;

//can do (할 수 있는것만 정의)
interface 리모컨이할수있는것 {
    public abstract void power();
}

abstract class 리모컨 implements 리모컨이할수있는것{
    private boolean power;

    public 리모컨() { //
        this.power = false;
    }
    public void power(){
        this.power = !this.power;
    }
    public boolean isPower() {
        return power;
    }
}



class 엘지리모컨 extends 리모컨 {

    }



class 삼성리모컨 extends 리모컨 {

    }


//인터페이스 (상하관계의 약속) 만드는 사람 갑, 사용하느 사람 을
public class InterApp {
    public static void main(String[] args) {
        리모컨 r1 = new 삼성리모컨();
        r1.power();
        System.out.println(r1.isPower());
        r1.power();
        System.out.println(r1.isPower());
    }
}
