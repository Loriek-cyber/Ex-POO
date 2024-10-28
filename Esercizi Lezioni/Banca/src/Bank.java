import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
/**
 * the bank is a abstract thing
 */
public class Bank {
    String name;
    Bank_account[] accounts;

    /**
     *
     * @param accounts is a list of elements
     */
    public Bank(String name) {
        name = name;
        accounts = new Bank_account[10];
    }

    private String genIban(){
        Random rand = new Random();
        String account="IT";
        for(int i=0; i<24; i++){
            account+=String.valueOf(rand.nextInt(10));
        }
        return account;
    }

    public Bank_account CreateAccount(Person p){
        return new Bank_account(p, genIban());
    }
}
