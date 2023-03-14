import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(1, "MyBank");

        User user1 = new User(1, "Trần Thị Cẩm Hoa",2004, 1, "342400", 90000000, "Đà Nẵng");
        User user2 = new User(2, "Trần Mẫn Mẫn", 2004, 1, "190604", 200000000, "Đà Nẵng");
        User user3 = new User(3, "Phạm Quang Tuấn", 2003, 1, "280223", 5000000, "Quảng Nam");

        bank.addUser(user1);
        bank.addUser(user2);
        bank.addUser(user3);

        System.out.println("Người dùng " + user1.getName() + " đang sử dụng " + bank.getName());

        System.out.println("Danh sách người dùng " + bank.getName() + ":");
        for (UserInterface user : bank.getUsers()) {
            System.out.println(user.toString());
        }

        System.out.println("Tổng số tiền trong ngân hàng " + bank.getName() + ": " + bank.getTotalBalance());

        user1.deposit(500000);

        user3.withdraw(2000000);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        List<UserInterface> sortedUsers = new ArrayList<>(bank.getUsers());
        Collections.sort(sortedUsers, new Comparator<UserInterface>() {
            @Override
            public int compare(UserInterface u1, UserInterface u2) {
                return Double.compare(u2.getBalance(), u1.getBalance());
            }
        });

        System.out.println("Người dùng trong ngân hàng " + bank.getName() + " được sắp xếp theo số dư:");
        for (UserInterface user : sortedUsers) {
            System.out.println(user.toString());
        }
    }
}
