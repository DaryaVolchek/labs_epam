import java.util.List;
import java.util.Arrays;

public class BookMain {
    private static List<Book> books = Arrays.asList(
            new Book(1, "Граф Монте-Кристо", "Александр Дюма", "Азбука", 2016, 1307, 37f, "Типографский"),
            new Book(2, "Гарри Поттер и Философский камень", "Джоанн Роулинг", "Росмэн", 2016, 348, 21f, "Типографский"),
            new Book(3, "Противостояние", "Стивен Кинг", "АСТ", 2017, 1315, 33f, "Интегральный"),
            new Book(4, "Иллюзия смерти", "Франк Тилье", "Азбука", 2019, 508, 19f, "Конторский"),
            new Book(5, "Код да Винчи", "Дэн Браун", "Азбука", 2013, 497, 16f, "Типографский"),
            new Book(6, "Повелитель мух", "Уильям Голдинг", "Азбука", 2012, 183, 9f, "Мягкий"),
            new Book(7, "Зеленая миля", "Стивен Кинг", "АСТ", 2016, 379, 24f, "Конторский"),
            new Book(8, "Портрет Дориана Грея", "Оскар Уайльд", "Азбука", 2014, 312, 14f, "Мягкий"),
            new Book(9, "Шоколад", "Джоанн Харрис", "Эксмо", 2016, 463, 17f, "Интегральный"),
            new Book(10, "Меч предназначения", "Анджей Сапковский", "Азбука", 2018, 507, 20f, "Типографский")
    );

    public static void main(String[] args){
        BookMetods bookMetod = new BookMetods(books);
        System.out.println("Список книг Стивена Кинга:\n");
        bookMetod.getBookByAuthor("Стивен Кинг").forEach(System.out::println);
        System.out.println("\nСписок книг издательства Азбука:\n");
        bookMetod.getBookByPublisher("Азбука").forEach(System.out::println);
        System.out.println("\nСписок книг, выпущенных после 2015 года:\n");
        bookMetod.getBookByGivenYear(2015).forEach(System.out::println);
    }
}
