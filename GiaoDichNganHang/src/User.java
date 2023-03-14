public class User implements UserInterface {
    private int id;
    private String name;
    private int birthYear;
    private int bankId;
    private String accountNumber;
    private double accountBalance;
    private String address;
    private boolean isLoyalCustomer;

    public User(int id, String name, int birthYear, int bankId, String accountNumber, double accountBalance, String address) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.bankId = bankId;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.address = address;
        this.isLoyalCustomer = (accountBalance > 10000000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        this.isLoyalCustomer = (accountBalance > 10000000);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        this.isLoyalCustomer = (accountBalance > 10000000);
    }

    @Override
    public void transfer(double amount, String recipient) {
        accountBalance -= amount;
        System.out.println("Chuyển khoản " + amount + " đếm " + recipient);
    }

    @Override
    public void withdraw(double amount) {
        accountBalance -= amount;
        this.isLoyalCustomer = (accountBalance > 10000000);
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Người dùng {" +
                "id=" + id +
                ", họ và tên ='" + name + '\'' +
                ", năm sinh=" + birthYear +
                ", bankId=" + bankId +
                ", số tài khoản='" + accountNumber + '\'' +
                ", số dư tài khoản=" + accountBalance +
                ", địa chỉ='" + address + '\'' +
                ", khách hàng thân thiết=" + isLoyalCustomer +
                '}';
    }
}
