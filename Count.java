import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, írja be az első számot: ");
        int elsoSzam = scanner.nextInt();

        System.out.print("Kérjük, írja be a második számot: ");
        int masodikSzam = scanner.nextInt();

        if (masodikSzam <= elsoSzam) {
            System.out.println("A második szám legyen nagyobb.");
        } else {
            for (int i = elsoSzam + 1; i < masodikSzam; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
