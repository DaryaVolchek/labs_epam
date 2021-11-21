public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishingYear;
    private int numberOfPages;
    private float price;
    private String bindingType;

    public Book(int id, String title, String author, String publisher, int publishingYear, int numberOfPages, float price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", Название='" + title + '\'' +
//                ", Автор='" + author + '\'' +
//                ", Издательство='" + publisher + '\'' +
//                ", Год издания=" + publishingYear +
//                ", Колчество страниц=" + numberOfPages +
//                ", Цена=" + price + " р." +
//                ", Тип переплета='" + bindingType + '\'' +
//                '}';
//    }
@Override
public String toString() {
    return "'" + title + "' " + author;
}
}
