import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adjon meg egy számot: ");
        int szam1 = scanner.nextInt();

        System.out.print("Kérjük, adjon meg egy számot: ");
        int szam2 = scanner.nextInt();

        if (szam1 > szam2) {
            System.out.println(szam1);
        } else if (szam1 < szam2) {
            System.out.println(szam2);
        } else {
            System.out.println(szam2); // Ha a számok egyenlők, akkor a másodikat írjuk ki
        }

        scanner.close();
    }
}
