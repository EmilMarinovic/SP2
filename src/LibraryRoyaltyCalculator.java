public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {
        Author jp = new Author("Jens Pedersen");

        jp.addTitle(new PrintedBook("Gennem Byen", "SKØN", 1000, 200));
        jp.addTitle(new AudioBook("Narkobetjenten", "FAG", 120, 200));
        jp.addTitle(new EAudioBook("Peter Edderkop", "BI", 50, 97, 205, 120));
        jp.addTitle(new EBook("TØmmerflåden", "SKØN", 60, 120, 210, 2000, true));

        System.out.println(jp.getName() + ": " + jp.calculateRoyalties() + "kr");
    }
}