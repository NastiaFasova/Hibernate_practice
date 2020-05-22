package library.dao;

import java.util.List;
import library.entity.Book;
import library.entity.Genre;

public interface BookDao {
    Book add(Book book);

    Book getByTitle(String title);

    List<Book> getByGenre(Genre genre);
}
