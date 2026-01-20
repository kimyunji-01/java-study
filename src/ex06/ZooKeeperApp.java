package ex06;

class Animal {
    void sound() {
        System.out.println();
    } //동물의 기본 소리

    void introduce() {
        System.out.println();
    } // 자기소개

    void act() {
        System.out.println();
    } // 동물의 추가행동
}

class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("제 이름은 " + name + " 입니다");
    }

    void sound() {
        System.out.println("멍멍!");
    }

    void act() {
        System.out.println("꼬리를 흔든다");
    }
}

class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("제 이름은 " + name + " 입니다");
    }

    void sound() {
        System.out.println("야옹!");
    }

    void act() {
        System.out.println("할퀸다");
    }
}

class Duck extends Animal {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("제 이름은 " + name + " 입니다");
    }

    void sound() {
        System.out.println("" +
                "꽥꽥!");
    }

    void act() {
        System.out.println("헤엄친다");
    }
}

class ZooKeeper {
    void action(Animal a) {
        a.introduce();
        a.sound();
        a.act();
        System.out.println();
    }
//       구현하기
}

public class ZooKeeperApp {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Dog("콩이");
        arr[1] = new Cat("나비");
        arr[2] = new Duck("덕돌이");

        ZooKeeper z = new ZooKeeper();
        for (Animal i : arr){
            z.action(i);
        }
    }
}
