public interface UserInterface {
    public void deposit(double amount);
    public void withdraw(double amount);
    public void transfer(double amount, String receiver);
    public double getBalance();
}
