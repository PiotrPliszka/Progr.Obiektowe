package zad1;

public class MyClass {
    public void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException();
        }
    }

    static void main(String[] args) {
        MyClass myClass = new MyClass();
        try{
            myClass.sprawdzFormatDanych("testtest.pl");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println(e.getMessage());
        }
    }

}
