//Scrivi un programma Java che dichiara una variabile di tipo int chiamata "numeroIntero"
// e una variabile di tipo String chiamata "numeroStringa". Esegui un cast della variabile
// "numeroIntero" in String e assegna il valore risultante alla variabile "numeroStringa".
// Stampa il valore della variabile "numeroStringa".
public class Esercizio3 {
    public static void main(String[] args) {
        int numerointero = 5;
        String numeroStringa = String.valueOf(numerointero); // valueOf è un metodo della classe stringa che trasfroma il numero int in asci
        System.out.println(numeroStringa);
    }
}
