package Message;

public class User {
    private String nick;
    private int phone;
    private String password;
    private String name;

    public User() {}
    public User(String nick, String name, int phone, String password) {
        this.nick = nick;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}