import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and balance and password to create an account!");
         String name = sc.nextLine();
        String generatedPassword = sc.nextLine();

        int balance = sc.nextInt();
        SBIUser acc1 = new SBIUser(name ,generatedPassword ,balance);
        System.out.println("The new Account number of user is "+acc1.getAccountNo());
        System.out.println("Enter the money you want to deposit");
        int money = sc.nextInt();
        String balancemoney = acc1.addmoney(money);


        System.out.println(balancemoney);
        System.out.println("Enter the money you want to withdraw and the password");


        int amt = sc.nextInt();
        String password = sc.next();
        int i=0;
        while(i<2 && password!=generatedPassword){
            password = sc.next();
            i++;
        }
        System.out.println(password);
        String remainingMoney =  acc1.withdrawmoney(amt ,password);

        System.out.println(remainingMoney);

    }

}