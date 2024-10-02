/*Scrivi un programma Java che dichiara una variabile di tipo intero chiamata "numero" e una
variabile di tipo double chiamata "numeroDecimale". Esegui un cast della variabile "numero" in
double e assegna il valore risultante alla variabile "numeroDecimale". Stampa il valore della
variabile "numeroDecimale".
* */

public class Main {
    public static void main(String[] args) {
        int numero = 5;
        double numeroDecimale = (double) numero;
        System.out.println(numeroDecimale);
    }
}