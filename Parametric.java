import java.util.Scanner;

public class Parametric {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány számot szeretne megadni: ");
        int darab = scanner.nextInt();

        int osszeg = 0;
        for (int i = 1; i <= darab; i++) {
            System.out.print("Adja meg a(z) " + i + ". számot: ");
            int szam = scanner.nextInt();
            osszeg += szam;
        }

        double atlag = (double) osszeg / darab;

        System.out.println("Összeg: " + osszeg + ", Átlag: " + atlag);

        scanner.close();
    }
}
