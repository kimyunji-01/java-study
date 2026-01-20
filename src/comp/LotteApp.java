package comp;

public class LotteApp {
    public static void main(String[] args) {
        //1.버거만 주세요
        Burger b1 = new Burger("기본 버거",1000);
        System.out.println(b1);
        //콜라만 주세요
        Coke c1 = new Coke("펩시콜라", 1500);
        System.out.println(c1);
        //쉬림ㅍ, 버거 주세요
        ShrimpBurger s1 = new ShrimpBurger("새우버거",2000,"새우");
        Coke c2 = new Coke("콜라",500);
        Potato p2 = new Potato("감자튀김",1500);

        BurgerSet set = new BurgerSet(s1,c2,p2);
        System.out.println(set.getTotalPrice());
    }
}
