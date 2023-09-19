import java.util.Scanner;

public class DrawChess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a sakktábla méretét: ");
        int meret = scanner.nextInt();

        for (int i = 0; i < meret; i++) {
            for (int j = 0; j < meret; j++) {
                // Ha a sor és az oszlop összege páros, akkor "#" kerül kiírásra, egyébként " "
                if ((i + j) % 2 == 0) {
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
