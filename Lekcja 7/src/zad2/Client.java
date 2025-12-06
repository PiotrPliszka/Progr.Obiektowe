package zad2;

import java.time.LocalDate;

public class Client implements Comparable<Client>{
    public String name;
    public int clientNumber;
    public LocalDate lastLogin;

    public Client(String name, int clientNumber, LocalDate lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    @Override
    public int compareTo(Client o) {
        if (this.lastLogin.isBefore(o.lastLogin)){
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastLogin=" + lastLogin +
                '}';
    }
}
