package ex06;
class Shape{
    void draw(){}
}

class Circle extends Shape{
    void draw(){
        System.out.println("원을 그립니다.");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("사각형을 그립니다.");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("삼각형을 그립니다.");
    }
}

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr [0] = new Circle ();
        arr [1] = new Rectangle ();
        arr [2] = new Triangle ();

        for (Shape kk : arr){ //여기서 kk는 지역변수로 내가 바꿀 수 있음
            // Shape kk = arr[0];
            // Shape kk = arr[1];
            // Shape kk = arr[2];
            kk.draw();
        }


    }
}
