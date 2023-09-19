public class Cuboid {
    public static void main(String[] args){
        double a = 10.4;
        double b = 13.5;
        double c = 8.2;

        double felulet = 2 * (a * b + b * c + c * a);
        double terfogat = a * b * c;

        System.out.println("Felület: " + felulet);
        System.out.println("Térfogat: " + terfogat);
    }
}
