class Main {
    int a;
    public static void main(String[] args) {

        Java n = new Java();
        n.a=3;
        System.out.println(n.a);
    }

    public static class Java{
        int a;
        public Java(){
            a = 0;
        }
    }
}

