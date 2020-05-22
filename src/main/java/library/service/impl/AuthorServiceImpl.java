package library.service.impl;

import java.util.List;
import library.dao.AuthorDao;
import library.entity.Author;
import library.entity.Book;
import library.lib.Inject;
import library.lib.Service;
import library.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Inject
    private AuthorDao authorDao;

    @Override
    public Author add(Author author) {
        return authorDao.add(author);
    }

    @Override
    public List<Book> getByAuthor(Author author) {
        return authorDao.getByAuthor(author);
    }
}
