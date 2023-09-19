import java.util.Scanner;

public class Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adjon meg egy számot: ");
        int szam = scanner.nextInt();

        if (szam % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
