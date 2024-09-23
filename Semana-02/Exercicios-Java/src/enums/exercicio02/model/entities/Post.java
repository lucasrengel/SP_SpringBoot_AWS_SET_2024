package enums.exercicio02.model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.title).append("\n");
        sb.append(this.likes);
        sb.append(" Likes - ");
        sb.append(moment.format(dtf)).append("\n");
        sb.append(this.content).append("\n");
        sb.append("Comments:\n");
        for (Comment comment : this.comments) {
            sb.append(comment.getText()).append("\n");
        }
        return sb.toString();
    }
}
