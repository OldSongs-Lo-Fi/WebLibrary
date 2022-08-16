package library.ua.WebLibrary.Repo;

import library.ua.WebLibrary.Ent.Usr;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Usr, Long> {
}
