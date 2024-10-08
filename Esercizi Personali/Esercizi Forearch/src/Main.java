// Calcolare la somma degli elementi di un array di double utilizzando il ciclo "foreach":
public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int somma = 0;
        for(int numero: array)
            somma += numero;
        System.out.println(somma);
    }
}