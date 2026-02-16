package zad3;

public class Test {
    static void main(String[] args){
        My m = new My();
        try{
            m.sprawdzFormatDanych("test@test.pl");
        }
        catch (NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }
}
