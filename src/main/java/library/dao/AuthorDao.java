package library.dao;

import java.util.List;
import library.entity.Author;
import library.entity.Book;

public interface AuthorDao {
    Author add(Author author);

    List<Book> getByAuthor(Author author);
}
