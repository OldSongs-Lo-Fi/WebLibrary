package library.ua.WebLibrary.Repo;

import library.ua.WebLibrary.Ent.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
