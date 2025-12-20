package zad5;

public class AuthenticationTest {
    static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        u1.login("user", "user123");
        u1.resetPassword("user", "user123", "user1234");
        u1.logout();
        System.out.println(u1);
    }
}
