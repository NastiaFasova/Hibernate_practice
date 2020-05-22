package library.service.impl;

import library.dao.GenreDao;
import library.entity.Genre;
import library.lib.Inject;
import library.lib.Service;
import library.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

    @Inject
    private GenreDao genreDao;

    @Override
    public Genre add(Genre genre) {
        return genreDao.add(genre);
    }
}
