import java.util.Random;
import java.util.Scanner;

public class Bankaccount {
    private String firstName;
    private String lastName;
    private int accountNumber = new Random(70000000).nextInt() + 10000000;
    private double credit;

    public void newAcount(String fName, String lName){
        firstName = fName;
        lastName = lName;
        accountNumber = new Random(70000000).nextInt() + 10000000;
        credit = 0;
    }

    public void setGeld(float value){
        credit += value;
    }

    public void getGeld(float value){
        credit -=value;
    }

    public double getCredit(){
        return credit;
    }

}