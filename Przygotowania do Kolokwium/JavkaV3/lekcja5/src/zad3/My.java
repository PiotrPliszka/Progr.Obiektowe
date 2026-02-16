package zad3;

public class My {
    public void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException();
        }
    }
}
