//Scrivi un programma Java che dichiara una variabile di tipo String chiamata "numeroStringa" e
// una variabile di tipo int chiamata "numeroIntero". Esegui un cast della variabile "numeroStringa"
// in int e assegna il valore risultante alla variabile "numeroIntero". Stampa il valore della variabile
// "numeroIntero".
public class Esercizio4 {
    public static void main(String[] args) {
        String numeroString = "8";
        int numero = Integer.parseInt(numeroString); //perseInt è un metodo della classe Integer che cerca gli interi in una stringa
        System.out.println(numero);
    }
}
