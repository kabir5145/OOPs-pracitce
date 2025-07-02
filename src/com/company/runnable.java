package com.company;


class good implements Runnable{
    @Override
    public void run() {
        System.out.println("THE GAME IS VERY GOOD DUE TO ITS GRAPHICS .");
    }
}
class bad implements Runnable{
    @Override
    public void run() {
        System.out.println("THE GAME IS VERY BAD AS IT HAS BAD GRAPHICS.");
    }
}
public class runnable {
    public static void main(String[] args) {
        good g = new good();
        Thread good = new Thread(g);
        good.start();
        bad b = new bad();
        Thread bad = new Thread(b);
        bad.start();
    }
}
