package telegraph.articles;

import telegraph.articles.models.Article;
import java.util.*;

public class RepositoryImpl implements  Repository<String, Article> {

    private  Map<String, Article> articles = new HashMap<String, Article>();

    public RepositoryImpl() {
        
    }    

    public Optional<Article> findById(String id) {
        return Optional.ofNullable(this.articles.get(id));
    }


    public Collection<Article> findByAuthor(String author) {
        return null;

    }


    public void persist(Article content) {
        this.articles.put(content.getId(), content);
    }


    public void delete(String id) {
        this.articles.remove(id);
    }

}