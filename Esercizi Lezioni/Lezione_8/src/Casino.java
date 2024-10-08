//In questo caso non utilizzero classi diverse ma sottoclassi diverse perchè vorrei qualcosa di coerente


import javax.swing.*;
import java.util.Random;
import java.io.*;

public class Casino {
    public static void main(String[] args) {
        Casini casino = new Casini();
        Player player = new Player();

        player.play(4,100,casino);
        System.out.println(player.getBalance());

    }

    public static class Casini{
        private double balance;

        public Casini() {
            balance = 100000;
        }
        public double play(int n, double bet){
            double betreturn = bet*5;
            Random rand = new Random();
            int random = rand.nextInt(6)+1;
            if(random==n){
                this.balance -= betreturn;
                return betreturn;
            }
            else {
                this.balance += bet;
                return 0;
            }

        }
    }

    public static class Player{
        private double balance;
        public Player() {
            balance = 1000;
        }
        public void play(int n, double bet, Casini casino){
            balance -= bet;
            double returne = casino.play(n, bet);
            balance += returne;
        }
        private double getBalance(){
            return balance;
        }
    }
}
