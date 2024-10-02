//Scrivi un programma Java che dichiara una variabile di tipo double chiamata
// "numeroDecimale" e una variabile di tipo int chiamata "numeroIntero".
// Esegui un cast della variabile "numeroDecimale" in int e assegna il valore
// risultante alla variabile "numeroIntero". Stampa il valore della variabile "numeroIntero".
public class Esercizio2 {
    public static void main(String[] args) {
        double numeroDecimale = 3.21;
        int numero = (int) numeroDecimale;
        System.out.println(numero);
    }
}
