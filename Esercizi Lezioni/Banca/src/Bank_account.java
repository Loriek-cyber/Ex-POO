import java.util.Random;
public class Bank_account {
    Person person;
    double balance;
    String iban;
    /**
     *
     * @param person is should be already created, so it would be useless to create another one
     * @param iban is would be auto-generated
     * @param iban it connect the account
     */
    Bank_account(Person person, String Iban) {
        this.person = person;
        this.balance = 0;
    }

    public String getIban() {
        return iban;
    }


}
