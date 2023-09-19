public class VariableMutation {
    public static void main(String[] args){
        int a = 3;
        // növeljük az "a" változó értékét 10 %-kal.
        a = (int) (a * 1.1);

        int b = 100;
        // a b változó értékét 7-gyel csökkentjük
        b -= 7;

        int c = 44;
        // megduplázzuk c értékét
        c *= 2;

        int d = 125;
        // d értékét elosztjuk 5-tel
        d /= 5;

        int e = 8;
        // kockára vesszük e értékét
        e = e * e * e;

        int f1 = 123;
        int f2 = 345;
        // megállapítjuk, hogy f1 nagyobb-e f2-nél (bólésként kiírjuk).
        boolean fNagyobb = f1 > f2;
        System.out.println("f1 nagyobb-e f2-nél: " + fNagyobb);

        int g1 = 350;
        int g2 = 200;
        // meghatározzuk, hogy g2 értéke nagyobb-e kétszeresével
        // mint g1 (bólusként kiírva).
        boolean g2Nagyobb = g2 > (2 * g1);
        System.out.println("g2 értéke nagyobb kétszeresével, mint g1: " + g2Nagyobb);

        int h = 136020258;
        // meghatározzuk, hogy h osztója 11-e (kiírjuk bólusként)
        boolean oszthato11 = h % 11 == 0;
        System.out.println("h osztható-e 11-tel: " + oszthato11);

        int i1 = 10;
        int i2 = 3;
        // meghatározzuk, hogy i1 nagyobb-e, mint i2 négyzete és kisebb-e, mint i2 köbmétere
        // (bólusként kiírva)
        boolean i1Nagyobb = i1 > (i2 * i2) && i1 < (i2 * i2 * i2);
        System.out.println("i1 nagyobb-e i2 négyzete és kisebb-e i2 köbmétere: " + i1Nagyobb);

        int j = 1521;
        // meghatározzuk, hogy j osztható-e 3-mal vagy 5-tel (kiírjuk boolean-ként)
        boolean oszthato3Vagy5 = j % 3 == 0 || j % 5 == 0;
        System.out.println("j osztható-e 3-mal vagy 5-tel: " + oszthato3Vagy5);
    }
}
