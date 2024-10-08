public class Tester {
    public static void lockTest(){
        Lock lock = new Lock("AAA");
        lock.setPosition('A');
        lock.setPosition('A');
        lock.setPosition('A');



        if(lock.unlock()){
            System.out.println("Lock acquired");
            System.out.println(lock.getSecret());
        }
        else
            System.out.println("Lock not acquired");
    }
}
