package telegraph.articles.models;

public class Article {

    private String id;
    private String headline;
    private String author;

    public Article(String id, String headline, String author) {
        this.id = id;
        this.headline = headline;
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

}
