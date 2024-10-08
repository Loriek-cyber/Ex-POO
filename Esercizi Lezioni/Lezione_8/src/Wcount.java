import javax.swing.*;

//Scrivere e testare un programma che data
//una parola w ed un testo t conta il numero di
// occorrenze di w in t
public class Wcount {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Inserisci la stringa");
        String word = JOptionPane.showInputDialog("Inserisci la parola");
        String[] words = input.split(" ");

        int count = 0;

        for(String w : words){
            if(w.equals(word)){
                count ++;
            }
        }
        JOptionPane.showMessageDialog(null, count);
    }
}
