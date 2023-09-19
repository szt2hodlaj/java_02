import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a számot: ");
        int szam = scanner.nextInt();

        System.out.println("A " + szam + "-ös szorzótábla:");

        for (int i = 1; i <= 10; i++) {
            int szorzat = i * szam;
            System.out.println(i + " * " + szam + " = " + szorzat);
        }

        scanner.close();
    }
}
