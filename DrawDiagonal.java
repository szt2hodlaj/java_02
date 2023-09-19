import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a négyzet méretét: ");
        int meret = scanner.nextInt();

        for (int i = 0; i < meret; i++) {
            for (int j = 0; j < meret; j++) {
                if (i == j) {
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
