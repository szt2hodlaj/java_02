import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a távolságot mérföldben: ");
        double merfold = scanner.nextDouble();

        double kilometer = merfold * 1.60934;

        System.out.println("A távolság km-ben: " + kilometer);

        scanner.close();
    }
}
