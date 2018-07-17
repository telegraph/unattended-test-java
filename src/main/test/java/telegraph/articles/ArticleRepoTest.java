package telegraph.articles;

import org.junit.Test;
import telegraph.articles.models.Article;

import java.util.Optional;

import static org.junit.Assert.*;

public class ArticleRepoTest {

    @Test
    public void testFindById() throws Exception {

        ArticleRepo repo = new ArticleRepo();

        Optional<Article> optArt = repo.findById("ID");
        assertFalse(optArt.isPresent());

    }



    @Test
    public void testFindByAuthor() throws Exception {

    }

    @Test
    public void testPersist() throws Exception {
        ArticleRepo repo = new ArticleRepo();
        Article article = new Article("1", "something", "James");

        repo.persist(article);

        Optional<Article> result = repo.findById("1");
        assert(result.get().equals(article));
    }




    @Test
    public void testDelete() throws Exception {

    }
}