import java.util.Date;

public class Soobsch {
    Date data;
    String text;
    String author;

    public Soobsch() {
    }

    public Soobsch(Date data, String text, String author) {
        this.data = data;
        this.text = text;
        this.author = author;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
