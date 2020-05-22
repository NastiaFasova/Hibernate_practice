package library.service;

import java.util.List;
import library.entity.Author;
import library.entity.Book;

public interface AuthorService {
    Author add(Author author);

    List<Book> getByAuthor(Author author);
}
