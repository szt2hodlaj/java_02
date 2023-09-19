import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a piramis magasságát: ");
        int magassag = scanner.nextInt();

        for (int i = 1; i <= magassag; i++) {
            // Szóközök rajzolása a bal oldalon
            for (int j = 1; j <= magassag - i; j++) {
                System.out.print(" ");
            }

            // Csillagok rajzolása
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Ugrás a következő sorba
            System.out.println();
        }

        scanner.close();
    }
}
