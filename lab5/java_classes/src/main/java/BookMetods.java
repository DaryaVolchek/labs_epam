import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookMetods {
    private List<Book> books;

    public BookMetods(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBookByAuthor(String author){
        return books.stream()
                .filter(book -> Objects.equals(book.getAuthor(), author))
                .collect(Collectors.toList());
    }

    public List<Book> getBookByPublisher(String publisher){
        return books.stream()
                .filter(book -> Objects.equals(book.getPublisher(), publisher))
                .collect(Collectors.toList());
    }

    public List<Book> getBookByGivenYear(int givenYear){
        return books.stream()
                .filter(book -> book.getPublishingYear() > givenYear)
                .collect(Collectors.toList());
    }
}
