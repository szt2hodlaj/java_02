import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a négyzet méretét: ");
        int meret = scanner.nextInt();

        for (int i = 1; i <= meret; i++) {
            for (int j = 1; j <= meret; j++) {
                // Az első és utolsó sor, valamint az első és utolsó oszlop esetén "%" karaktert rajzolunk,
                // egyébként szóköz karaktert rajzolunk
                if (i == 1 || i == meret || j == 1 || j == meret) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Ugrás a következő sorba
        }

        scanner.close();
    }
}
