package commerce;

public class TestShop {
    static void main(String[] args) {
        Shop s1 = Shop.getInstance(200.50, 10.50, 67);
        System.out.println(s1);
        Shop s2 = Shop.getInstance(1050.10, 149.50, 150);
        System.out.println(s2);
    }
}
