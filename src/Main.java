import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name Password and balance to create an account");

        //create user
        String name=sc.next();
        double balance=sc.nextDouble();
        String password=sc.next();

        SbiUser user=new SbiUser(name,balance,password);

        //add money
       String message= user.addMoney(1000);
       System.out.println(message);

       //withdraw amount
        System.out.println("Enter amt to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter Password");
        String pass=sc.next(user.getPassword());
        System.out.println(user.getAccountNo());
        System.out.println(user.withdrawMoney(money,pass));

        //ROI
        System.out.println(user.calculateInterest(10));
    }

}