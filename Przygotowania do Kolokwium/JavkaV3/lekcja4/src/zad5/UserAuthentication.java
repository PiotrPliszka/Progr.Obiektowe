package zad5;

public class UserAuthentication implements Authentication{
    static String user = "user123";
    static String pass = "haslo123";
    @Override
    public boolean login(String username, String password) {
        if (username.equals(user) && password.equals(pass)){
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (login(username, oldPassword)){
            pass = newPassword;
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        System.out.println(u1.login("user123", "haslo123"));
        u1.logout();
        u1.resetPassword("user123", "haslo123", "xD");
        System.out.println(pass);
    }
}
