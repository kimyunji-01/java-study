package ex06;

class Data{ //defalt extends가 되어있다. 모든 class의 부모는 object다
    int num;

    public Data(int num){
        this.num = num;
    }

    @Override // 무효화
    public int hashCode() {
        return 9; // super=부모의 주소 .부모의 해시코드가 무효화 되었음
    }
}

public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1= new Data(1); //상태는 같으나, 주소는 다르다
        Data d2=new Data(1);
        Data d3= d1; //얕은 복사 (주소만 복사)


        System.out.println(d1.hashCode()); //안의 값을 비교해야 동등한 개체인지 알 수 있음
        System.out.println(d2.hashCode());

        if(d1.hashCode()==d2.hashCode()) {
            System.out.println("같은 주소에 있는 개체");
        }else{
            System.out.println("다른 주소에 있는 객체");}
        if (d1.num==d2.num) {
            System.out.println("값이 같습니다.");
        }else {
            System.out.println("값이 다릅니다.");
        }
        if (d1.hashCode()==d3.hashCode()){
            System.out.println("같아요!! 얕은 복사가 됐어요");
        }else{
            System.out.println("달라요!!new 가 된 다른 주소인거 같아요.");
    }
    }
}
