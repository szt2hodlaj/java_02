import java.util.Scanner;

public class HelloU {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérjük, adja meg a nevét: ");
        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);

        scanner.close();
    }
}
