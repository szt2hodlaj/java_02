import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a lányok számát: ");
        int lanyokSzama = scanner.nextInt();

        System.out.print("Kérjük, adja meg a fiúk számát: ");
        int fiukSzama = scanner.nextInt();

        int osszletszam = lanyokSzama + fiukSzama;

        if (osszletszam >= 20) {
            if (lanyokSzama == fiukSzama) {
                System.out.println("A buli kitűnő!");
            } else {
                System.out.println("Egész jó kis buli!");
            }
        } else {
            if (lanyokSzama == 0) {
                System.out.println("A lányok száma nem számít, ha sokan jönnek: Kolbászparti");
            } else {
                System.out.println("Ha 20 ember jön, akkor nem lesz több, mint 20: Átlagos buli...");
            }
        }

        scanner.close();
    }
}
