package zad2;

import java.time.LocalDate;

public class Client implements Comparable<Client>{
    public String name;
    public int ClientNumber;
    public LocalDate lastLogin;


    public Client(String name, int clientNumber, LocalDate lastLogin) {
        this.name = name;
        ClientNumber = clientNumber;
        this.lastLogin = lastLogin;


    }

    @Override
    public int compareTo(Client o) {
        if (lastLogin.isBefore(o.lastLogin)){
            return 1;
        }
        else {
            return -1;
        }
    }
}
