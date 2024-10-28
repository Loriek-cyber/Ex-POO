/**
 * <p1>Project Bank</p1>
 */

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Andrea","Rossi","andrea.rossi@gmail.com","23/02/2014");
        Bank revolut = new Bank("Revolut");
        Bank_account arjel = revolut.CreateAccount(p);
        System.out.println(arjel.getIban());
    }
    // Main.print()
    public static void print(){

    }
}