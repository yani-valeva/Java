import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String[] phrases = { "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product." };
        String[] events = { "Now I feel good.", "I have succeeded with this product.", "Makes miracles.I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int count = 0; count < number; count++)
        {
            int phraseNumber = 0 + (int)(Math.random() * phrases.length);
            int eventNumber = 0 + (int)(Math.random() * events.length);
            int authorNumber = 0 + (int)(Math.random() * authors.length);
            int cityNumber = 0 + (int)(Math.random() * cities.length);

            String currentPhrase = phrases[phraseNumber];
            String currentEvent = events[eventNumber];
            String currentAuthor = authors[authorNumber];
            String currentCity = cities[cityNumber];

            System.out.println(String.format("%s %s %s %s", currentPhrase, currentEvent, currentAuthor, currentCity));
        }
    }
}
