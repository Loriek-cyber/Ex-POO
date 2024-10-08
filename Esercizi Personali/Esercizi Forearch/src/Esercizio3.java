//Contare il numero di vocali in una stringa utilizzando il ciclo "foreach":
public class Esercizio3 {
    public static void main(String[] args) {
        String s = "Hello world";
        int n = 0;
        for(char c : s.toCharArray()){
            if (isVocal(c))
                n++;
        }
        System.out.println("Il numero di vocali è uguale a "+n);
    }

    public static boolean isVocal(char a){
        char temp = Character.toLowerCase(a);
        return temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u';
    }
}
