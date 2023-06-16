public class Main {
    public static void main(String[] args) throws InterruptedException {
        SoucetPrvocisel Soucet = new SoucetPrvocisel();

        VypisPrvocisla Vlakno1 = new VypisPrvocisla(1);
        VypisPrvocisla Vlakno2 = new VypisPrvocisla(2);
        VypisPrvocisla Vlakno3 = new VypisPrvocisla(3);
        VypisPrvocisla Vlakno4 = new VypisPrvocisla(4);
        VypisPrvocisla Vlakno5 = new VypisPrvocisla(5);
        VypisPrvocisla Vlakno6 = new VypisPrvocisla(6);
        VypisPrvocisla Vlakno7 = new VypisPrvocisla(7);
        VypisPrvocisla Vlakno8 = new VypisPrvocisla(8);
        VypisPrvocisla Vlakno9 = new VypisPrvocisla(9);
        VypisPrvocisla Vlakno10 = new VypisPrvocisla(0);

        Vlakno1.start();
        Vlakno2.start();
        Vlakno3.start();
        Vlakno4.start();
        Vlakno5.start();
        Vlakno6.start();
        Vlakno7.start();
        Vlakno8.start();
        Vlakno9.start();
        Vlakno10.start();

        Vlakno1.join();
        Vlakno2.join();
        Vlakno3.join();
        Vlakno4.join();
        Vlakno5.join();
        Vlakno6.join();
        Vlakno7.join();
        Vlakno8.join();
        Vlakno9.join();
        Vlakno10.join();

        System.out.println(Soucet.vratSoucet());
    }
}