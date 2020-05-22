package library.service.impl;

import java.util.List;
import library.dao.BookDao;
import library.entity.Book;
import library.entity.Genre;
import library.lib.Inject;
import library.lib.Service;
import library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Inject
    private BookDao bookDao;

    @Override
    public Book getByTitle(String title) {
        return bookDao.getByTitle(title);
    }

    @Override
    public List<Book> getByGenre(Genre genre) {
        return bookDao.getByGenre(genre);
    }

    @Override
    public Book add(Book book) {
        return bookDao.add(book);
    }
}
