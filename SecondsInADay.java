public class SecondsInADay {
    public static void main(String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingSeconds = (24 - currentHours) * 3600 + (60 - currentMinutes) * 60 + (60 - currentSeconds);

        System.out.println("Hátralévő másodpercek a napból: " + remainingSeconds);
    }
}
