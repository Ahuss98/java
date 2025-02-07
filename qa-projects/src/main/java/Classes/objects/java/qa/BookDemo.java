package Classes.objects.java.qa;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("george martin", "game of thrones", "Fantasy", 864);
        Book mathBook = new Book("james stuart", "calculas", "math", 1392);
        Book javaBook = new Book("joel murach", "murachs java programming" , "programing", 800);

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }
}
