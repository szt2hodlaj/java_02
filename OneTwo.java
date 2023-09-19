import java.util.Scanner;

public class OneTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adjon meg egy számot: ");
        int szam = scanner.nextInt();

        if (szam <= 0) {
            System.out.println("Nem elég");
        } else if (szam == 1) {
            System.out.println("One");
        } else if (szam == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Sok");
        }

        scanner.close();
    }
}
