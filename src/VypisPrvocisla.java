public class VypisPrvocisla extends SoucetPrvocisel{
    int k;

    public VypisPrvocisla(int k) {
        this.k = k;
    }

    @Override
    public void run() {
        int a = 0;
        if (k == 0) {
            a = 2;
        }
        for (int n = (k*100)+a; n < k*100 + 99; n++) {
            //pro každé n budu kontrolovat jestli je prvočíslem
            if (jePrvocislo(n)) {
                System.out.println(n);
                synchronized (SoucetPrvocisel.soucet) {
                    SoucetPrvocisel.soucet += n;
                }
            }
        }
    }

    public int vratSoucet() {
        return soucet;
    }

    public boolean jePrvocislo(int x) {
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }
}
