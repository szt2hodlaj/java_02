public class TwoNumbers {
    public static void main(String[] args){
        int szam1 = 13;
        int szam2 = 22;

        // Összeadás
        int osszeadas = szam1 + szam2;
        System.out.println("A 13 és 22 összeadásának eredménye: " + osszeadas);

        // Kivonás
        int kivonas = szam2 - szam1;
        System.out.println("A 22-ből kivont 13 eredménye: " + kivonas);

        // Szorzás
        int szorzas = szam1 * szam2;
        System.out.println("A 13 és 22 szorzatának eredménye: " + szorzas);

        // Osztás (tizedes törtként)
        double osztas = (double) szam2 / szam1;
        System.out.println("A 22 és 13 osztásának eredménye: " + osztas);

        // Egész osztás
        int egeszOsztas = szam2 / szam1;
        System.out.println("A 13-mal osztott 22 egész szám része: " + egeszOsztas);

        // Maradék osztás
        int maradekOsztas = szam2 % szam1;
        System.out.println("A 13-mal osztott 22 maradéka: " + maradekOsztas);
    }
}
