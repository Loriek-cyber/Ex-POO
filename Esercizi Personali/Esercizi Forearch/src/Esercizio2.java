//Stampare le lettere di una stringa utilizzando il ciclo "foreach":
public class Esercizio2 {
    public static void main(String[] args) {
        String testo = "Ciao!";
        for(char car: testo.toCharArray()){ //toCharArray restituisce l'array di char
            System.out.println(car);
        }
    }
}
