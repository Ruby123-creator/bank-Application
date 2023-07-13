import java.sql.SQLOutput;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String AccountNo;
    private int balance;
    private String name;
    private  String password;
    private static float rateOfInterest;


    public SBIUser( String name ,String password,int balance) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }
    public String getAccountNo(){
        return AccountNo;
    }
    public int getBalance() {
        return balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addmoney(int money) {
        balance = balance + money;
        return (money +"Money is added succesfully ,now the balnace is" +balance );
    }

    @Override
    public String ChangePassword(String oldpassword ,String newpassword){
        if(oldpassword==this.password){
            this.password = newpassword;
            return  "password updated successfully";
        }
        else{

            return "wrong password";
        }
    }
    @Override
    public String withdrawmoney(int money ,String Enterpassword) {
        if(Enterpassword==this.password){

            if(money>balance){
                return "Bhai tu kangaal h";
            }

            else {
                balance = balance - money;
                return (money + "Money is deducted from your bank ,the ramining balance is" + balance);
            }
        }
        else {
            return "Wrong Password";
        }

    }

    @Override
    public float calculateInterest(int year) {
        float interest =balance*year*rateOfInterest/100;
        return interest;
    }
}
