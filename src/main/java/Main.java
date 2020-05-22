import java.util.ArrayList;
import java.util.List;
import library.entity.Author;
import library.entity.Book;
import library.entity.Genre;
import library.lib.Injector;
import library.service.AuthorService;
import library.service.BookService;
import library.service.GenreService;

public class Main {
    private static Injector injector = Injector.getInstance("library");

    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Ivan");
        author.setSurname("Franko");
        AuthorService authorService = (AuthorService) injector.getInstance(AuthorService.class);
        authorService.add(author);
        List<Author> authorList = new ArrayList<>();
        authorList.add(author);
        Genre genre = new Genre();
        genre.setName("fiction");
        GenreService genreService = (GenreService) injector.getInstance(GenreService.class);
        genreService.add(genre);
        Book book = new Book();
        book.setAuthors(authorList);
        book.setGenre(genre);
        book.setTitle("Some stories");
        BookService bookService = (BookService) injector.getInstance(BookService.class);
        bookService.add(book);
        Book bookByTitle = bookService.getByTitle("Some stories");
        System.out.println(bookByTitle);
        bookService.getByGenre(genre).forEach(System.out::println);
        List<Book> booksByAuthor = authorService.getByAuthor(author);
        booksByAuthor.forEach(System.out::println);
    }
}
