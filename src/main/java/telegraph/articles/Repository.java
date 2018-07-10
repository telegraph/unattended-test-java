package telegraph.articles;

import java.util.Collection;
import java.util.Optional;

public interface Repository<T> {

    /**
     * Find content by id
     *
     * @param id
     * @return
     */
    Optional<T> findById(String id);

    /**
     * Find contents written by specific author
     *
     * @param author
     * @return
     */
    Collection<T> findByAuthor(String author);

    /**
     * Create or update existing content
     *
     * @param
     */
    void persist(T content);

    /**
     * Deletes content by id
     *
     * @param id
     */
    void delete(String id);

}
