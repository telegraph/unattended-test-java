package telegraph.articles;

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
     * Create or update existing content
     *
     * @param
     */
    void persist(T article);

    /**
     * Deletes content by id
     *
     * @param id
     */
    void delete(String id);

}
