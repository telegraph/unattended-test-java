package telegraph.articles;

import telegraph.articles.models.Article;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepositoryImplTest {

    private final Repository myRepo;

    public RepositoryImplTest() {
        this.myRepo = new RepositoryImpl();
    }

    @Test
    public void shouldPersistAndFindTheArticle() {
        // Given
        Article article = new Article("1","Test","Adel");

        // When 
        this.myRepo.persist(article);

        // Then
        assertEquals(article,   this.myRepo.findById("1"));
    }

    // @Test
    // public void shouldPersistJustUpdateTheProperties() {
    //     // Given
    //     Article article = new Article("1","Test","Adel");
    //     Article article2 = new Article("1","Test","John");


    //     // When 
    //     this.myRepo.persist(article);
    //     this.myRepo.persist(article2);


    //     // Then
    //     assertEquals(article2,   this.myRepo.findById("1"));
    // }

    @Test
    public void shouldNotFindTheArticle() {
        assertFalse(this.myRepo.findById("1").isPresent());
    }

    // @Test
    // public void shouldDeleteArticle() {
    //     // Given
    //     Article article = new Article("1","Test","Adel");
    //     Article article2 = new Article("2","Test2","John");
    //     // When 
    //     this.myRepo.persist(article);
    //     this.myRepo.persist(article2);
    //     assertEquals(article,  this.myRepo.findById("1"));
    //     this.myRepo.delete("1");

    //     // Then
    //     assertNull(this.myRepo.findById("1"));

    // }



}