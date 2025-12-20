package zad5;

public class UserAuthentication implements Authentication{
    private String currentPassword = "user123";

    @Override
    public boolean login(String username, String password) {
        if(username.equals("username") && password.equals(currentPassword)){
            System.out.println("Zalogowane");
            return true;
        }
        else{
            System.out.println("Błędne dane");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(username.equals("user") && oldPassword.equals(currentPassword)){
            currentPassword = newPassword;
            System.out.println("Zmieniono hasło");
            return true;
        }
        else {
            System.out.println("Błędne dane");
            return false;
        }
    }

    @Override
    public String toString() {
        return "UserAuthentication{" +
                "currentPassword='" + currentPassword + '\'' +
                '}';
    }
}
