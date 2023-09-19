import java.util.Scanner;
import java.util.Random;

public class GuessThe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targySzam = random.nextInt(101);

        System.out.println("Üdvözöljük a találgatós játékban! Találja ki a számot 0 és 100 között.");

        int tipp;
        boolean talalt = false;

        while (!talalt) {
            System.out.print("Kérjük, írja be a tippjét: ");
            tipp = scanner.nextInt();

            if (tipp < targySzam) {
                System.out.println("A tárolt szám nagyobb, mint " + tipp);
            } else if (tipp > targySzam) {
                System.out.println("A tárolt szám kisebb, mint " + tipp);
            } else {
                System.out.println("Megtalálta a tárolt " + targySzam + " számot!");
                talalt = true;
            }
        }

        scanner.close();
    }
}
