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
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
