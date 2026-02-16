package zad1;

public class Test {
    public static <obj extends Cain> boolean porownanie(obj object1, obj object2){
        if (object1.getClass() == object2.getClass()){
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        Cain c1 = new Cain();
        Cain c2 = new Cain();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        System.out.println(porownanie(c1, c2));
        System.out.println(porownanie(d1, c2));
        System.out.println(porownanie(d1, d2));
    }
}
