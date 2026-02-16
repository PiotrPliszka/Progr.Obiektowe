package zad1;

public record BookDTO(String title, String author, double price, int yearOfPublication) {
    static void main(String[] args){
        BookDTO b1 = new BookDTO("XD", "PEP", 20.20, 2020);
        System.out.println(b1);
    }
}
