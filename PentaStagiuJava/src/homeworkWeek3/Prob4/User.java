package homeworkWeek3.Prob4;

public class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Username: " + name;
    }
}