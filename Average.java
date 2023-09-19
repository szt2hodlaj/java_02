import java.util.Scanner;

public class Average {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int szamok[] = new int[5];
        int osszeg = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Kérjük, írjon be egy számot: ");
            szamok[i] = scanner.nextInt();
            osszeg += szamok[i];
        }

        double atlag = (double) osszeg / 5;

        System.out.println("Összeg: " + osszeg + ", Átlag: " + atlag);

        scanner.close();
    }
}
