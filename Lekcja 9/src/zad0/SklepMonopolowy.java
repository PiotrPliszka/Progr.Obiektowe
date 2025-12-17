package zad0;

public class SklepMonopolowy {
    public static void checkAge(int age){
        if (age >= 18){
            System.out.println("Wiek zwerifkowany pomyślnie");
        }else{
//           Jeśli wejdzie tutaj to pojawia się bład ktory trzeba gdzies obsłużyć.
            throw new IllegalArgumentException("Klient nie ma 18 lat!");
        }
    }
    public static void checkID(String imie) throws NiepoprawnyFormatDanychException{
        if(imie.charAt(0) >= 'A' && imie.charAt(0) <= 'Z'){
            System.out.println("Imie prawidłowe");
        }else{
            throw new NiepoprawnyFormatDanychException("Dowód podrobiony");
        }
    }

    static void main(String[] args){
        checkAge(25);
        checkAge(26);
        try {
            checkAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("Wróc jak podrośniesz");
        }
        try{
         checkID("Stanisław");
         checkID("stanisław");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Podrobiony dowód");
        }
    }
}
