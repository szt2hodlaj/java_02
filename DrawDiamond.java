import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a gyémánt magasságát: ");
        int magassag = scanner.nextInt();

        // Felső rész rajzolása
        for (int i = 1; i <= magassag; i++) {
            for (int j = 1; j <= magassag - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("%");
            }
            System.out.println();
        }

        // Alsó rész rajzolása
        for (int i = magassag - 1; i >= 1; i--) {
            for (int j = 1; j <= magassag - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("%");
            }
            System.out.println();
        }

        scanner.close();
    }
}
