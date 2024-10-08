import javax.swing.*;

public class Main {
    //generazione di numeri primi
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserisci il limite");
        int limite = Integer.parseInt(input);
        for (int i = 1; i <= limite; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}