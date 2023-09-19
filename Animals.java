import java.util.Scanner;

public class Animals {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a csirkék számát: ");
        int csirkekSzama = scanner.nextInt();

        System.out.print("Kérjük, adja meg a sertések számát: ");
        int sertesekSzama = scanner.nextInt();

        int osszesLabakSzama = (csirkekSzama * 2) + (sertesekSzama * 4);

        System.out.println("Lábak száma: " + osszesLabakSzama);

        scanner.close();
    }
}
