package library.service;

import java.util.List;
import library.entity.Book;
import library.entity.Genre;

public interface BookService {
    Book getByTitle(String title);

    List<Book> getByGenre(Genre genre);

    Book add(Book book);
}
