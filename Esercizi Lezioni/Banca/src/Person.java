public class Person {
    public String nome;
    public String surname;
    public String email;
    public Date data;


    private static class Date{
        int day;
        int month;
        int year;

        public Date(int day, int month, int year){
            /**
             * @use type the day on the forum
             * @controll the data will be controlled
             * @return the class
             */
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public Date(String date) /** dd/mm/aaa*/ {
            String[] d = date.split("/");
            this.day = Integer.parseInt(d[0]);
            this.month = Integer.parseInt(d[1]);
            this.year = Integer.parseInt(d[2]);
        }
    }


    public Person(String nome, String surname, String email, String data){
        this.nome = nome;
        this.surname = surname;
        this.email = email;
        this.data = new Date(data);
    }
    public Person(String nome, String surname, String email,int day, int month, int year){
        this.nome = nome;
        this.surname = surname;
        this.email = email;
        this.data = new Date(day,month,year);
    }

    /**--**/

    public boolean equal(Person p1, Person p2){
        if(p1.nome != p2.nome)
            return false;
        else if (p1.surname != p2.surname) {
            return false;}
        else if (p1.email != p2.email) {
            return false;}
        else if (p1.data != p2.data) {
            return false;
        }
        return true;
    }

}
