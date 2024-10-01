public class Rettangolo {
    private Punto p1 = new Punto();
    private Punto p2 = new Punto();
    private Punto p3 = new Punto();
    private Punto p4 = new Punto();

    //larghezze
    private int Lenght;
    private int height;

    public Rettangolo(Punto p1, Punto p2){
        this.p1.setX(p1.getX());
        this.p1.setY(p1.getY());
        this.p2.setX(p2.getX());
        this.p2.setY(p2.getY());

        //Metodo a due punti perche sono prigro

        /**P3 è l'intersezione tra la retta verticale passante per P1 e la retta orizzontale che passa per P2*/
        p3.setX(p1.getX());
        p3.setY(p2.getY());
        /**P3 è l'intersezione tra la retta verticale passante per P1 e la retta orizzontale che passa per P2*/
        p4.setX(p2.getX());
        p4.setY(p1.getY());

        height = (p2.getY()) - (p4.getY());
        Lenght = p4.getX() - p1.getX();
    }

    public Rettangolo(Punto p1,int lenght,int height){
        this.p1.setX(p1.getX());
        this.p1.setY(p1.getY());

        this.p2.setX(p1.getX());
        this.p2.setY(p1.getY()-height);

        p3.setX(p1.getX()+lenght);
        p3.setY(p2.getY());

        p4.setX(p3.getX());
        p4.setY(p1.getY());
    }

    // ritorno di getN_Punto @return punto
    public Punto getP1() {
        return p1;
    }
    public Punto getP2() {
        return p2;
    }
    public Punto getP3() {
        return p3;
    }
    public Punto getP4() {
        return p4;
    }

    public int getLenght() {
        return Lenght;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return height * Lenght;
    }

    public int getPerimeter(){
        return (2 * Lenght)+ (2 * height);
    }

    public boolean transla(Punto punto){

    }
}
