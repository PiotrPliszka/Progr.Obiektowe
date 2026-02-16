package zad2;

import java.time.LocalDate;
import java.util.Date;

public class Client implements Comparable<Client>{
    String name;
    int clientNumber;
    LocalDate lastLogin;

    public Client(String name, int clientNumber, LocalDate lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }


    @Override
    public int compareTo(Client o) {
        return this.lastLogin.compareTo(o.lastLogin);
    }
}
