public class Coding {
    public static void main(String[] args) {
        int napiKodolasOraja = 6;
        int hetiMunkanapokSzama = 5;
        int szemeszterHetekSzama = 17;
        int atlagosHetimunkaIdo = 52; // Órában

        // Kódolási órák száma egy félévben munkanapokon
        int kodolasOraFélévben = napiKodolasOraja * hetiMunkanapokSzama * szemeszterHetekSzama;

        // Kódolási órák százalékos aránya a félévben
        double kodolasArany = (double) kodolasOraFélévben / (atlagosHetimunkaIdo * szemeszterHetekSzama) * 100;

        System.out.println("Egy résztvevő " + kodolasOraFélévben + " órát tölt kódolással egy félévben munkanapokon.");
        System.out.println("A kódolási órák százalékos aránya a félévben: " + kodolasArany + "%");
    }
}
