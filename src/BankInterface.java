public interface BankInterface {
    int checkBalance();
    String addmoney(int money);
    String withdrawmoney(int money ,String password);
    String ChangePassword(String oldpassword , String newpassword);
    float calculateInterest(int year);
}
