package enums.exercicio02.application;

import enums.exercicio02.model.entities.Comment;
import enums.exercicio02.model.entities.Post;

import java.time.LocalDateTime;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        LocalDateTime d1 = LocalDateTime.parse("2018-06-21T13:05:44");
        Post p1 = new Post(d1, "Traveling to New Zeland", "I'm going to visit to this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        LocalDateTime d2 = LocalDateTime.parse("2018-07-28T23:14:19");
        Post p2 = new Post(d1, "Good night guys", "See you tomorrow", 5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
