package ex04;

public class People {
    private String name; //이름
    private int height; //키
    private int weight; //무게

    People(String name, int height, int weight){    //생성자 오버로딩
    this.name= name;
    this.height= height;
    this.weight= weight;

    // => 상태 초기화

    }
    //상태변경
    public void 밥먹기(){
        weight = weight +2;

    }

    //상태확인
    public int getWeight(){
        return weight; // 같은 클래스라서 private지만 접근 가능
    }

}
