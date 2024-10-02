//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(4,8);
        Punto p2 = new Punto(8,16);
        Rettangolo r1 = new Rettangolo(p1,p2);
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());

    }
}