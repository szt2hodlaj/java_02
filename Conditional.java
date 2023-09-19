public class Conditional {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        int kreditek = 60;
        boolean isBonus = false;
        int d = 12;
        int ido = 150;

        // 1. Feltétel: Páros szám növelése
        if (a % 2 == 0) {
            a++;
        }

        // 2. Feltétel: Szöveg kimenet beállítása b alapján
        String output2;
        if (b >= 10 && b <= 20) {
            output2 = "Édes!";
        } else if (b < 10) {
            output2 = "Kevesebbre!";
        } else {
            output2 = "Tovább!";
        }

        // 3. Feltétel: Kreditek ellenőrzése és output3 beállítása
        int output3 = 0;
        if (kreditek >= 50 && !isBonus) {
            output3 -= 2;
        } else if (kreditek < 50 && !isBonus) {
            output3 -= 1;
        }

        // 4. Feltétel: output4 beállítása d és ido alapján
        String output4;
        if (d % 4 == 0 && ido <= 200) {
            output4 = "Check";
        } else if (ido > 200) {
            output4 = "Időtúllépésre";
        } else {
            output4 = "Futtatás Erdőfutásra!";
        }

        // Eredmények kiírása
        System.out.println("1. Eredmény (a): " + a);
        System.out.println("2. Eredmény (output2): " + output2);
        System.out.println("3. Eredmény (output3): " + output3);
        System.out.println("4. Eredmény (output4): " + output4);
    }
}
