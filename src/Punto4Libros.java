public class Punto4Libros {
    private String name;

    private String author;

    private int scoreData;

    public Punto4Libros(String name, String author, int scoreData) {
        this.name = name;
        this.author = author;
        this.scoreData = scoreData;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getScoreData() {
        return scoreData;
    }
}
