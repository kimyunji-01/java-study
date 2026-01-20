package comp;

/**
 * *1. is 상속 - extends로
 * 2. can do 인터페이스
 * 3. has 결합(composite) - 상태로 가지면 됨.
 */
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet(Burger burger, Coke coke, Potato potato) { //생성자로 초기화
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public int getTotalPrice(){
        int totalPrice = burger.getPrice() + coke.getPrice() + potato.getPrice();
        totalPrice = (int)(totalPrice * 0.9);
        return totalPrice;

    }

}
