import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookLibraryModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        library.books = new ArrayList<>();

        int numberOfBook = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfBook; i++) {
            String[] input = scanner.nextLine().split(" ");

            Book book = new Book();
            book.setTitle(input[0]);
            book.setAuthor(input[1]);
            book.setPublisher(input[2]);
            book.setReleaseDate(LocalDate.parse(input[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            book.setIsbnNumber(input[4]);
            book.setPrice(Double.parseDouble(input[5]));
            library.getBooks().add(book);
        }

        String dateAsString = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Map<String, LocalDate> booksAndReleasedDates = new HashMap<String, LocalDate>();

        for (Book book : library.books) {
            String title = book.title;
            LocalDate date = book.releaseDate;

            if (!booksAndReleasedDates.containsKey(title) && date.compareTo(startDate) > 0) {
                booksAndReleasedDates.put(title, date);
            }
        }

        booksAndReleasedDates.entrySet().stream().sorted((e1, e2) -> {
            if (e1.getValue().compareTo(e2.getValue()) == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return e1.getValue().compareTo(e2.getValue());
        }).forEach(pair -> System.out.println(String.format("%s -> %s",pair.getKey(),pair.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))));
    }
}

class Library {
    public String name;

    public List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

class Book {
    public String title;

    public String author;

    public String publisher;

    public LocalDate releaseDate;

    public String isbnNumber;

    public double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}