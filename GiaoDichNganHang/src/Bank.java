import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int id;
    private String name;
    private List<UserInterface> users;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void addUser(UserInterface user) {
        this.users.add(user);
    }

    public double getTotalBalance() {
        double total = 0;
        for (UserInterface user : users) {
            total += user.getBalance();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<UserInterface> getUsers() {
        return users;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<UserInterface> users) {
        this.users = users;
    }

    public String toString() {
        return "Bank ID: " + id + ", Tên : " + name + ", Tổng số dư : " + getTotalBalance();
    }
}
