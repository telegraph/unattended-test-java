package telegraph.articles;

import telegraph.articles.models.Article;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class ArticleRepo implements Repository<String, Article>{

    private Collection<Article> articles = new ArrayList<>();

    @Override
    public Optional<Article> findById(String id) {
        return articles.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    @Override
    public Collection<Article> findByAuthor(String author) {
        return null;
    }

    @Override
    public void persist(Article content) {
        if (!articles.contains(content))
            articles.add(content);
    }

    @Override
    public void delete(String id) {

    }
}
