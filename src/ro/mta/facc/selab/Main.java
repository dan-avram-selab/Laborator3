package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        /*
        Carte c = new Carte("Casa Buddenbrook", "Thomas Mann", 1990, 533);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addCarte(c);
        biblioteca.addCarte(new Carte("Codul lui DaVinci", "Dan Brown" ,1999, 500));
        biblioteca.addCarte(new Carte("Amintiri din copilarie", "Ion Creanga", 1881, 80));

        biblioteca.sort();
        System.out.println(biblioteca);
        */
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
