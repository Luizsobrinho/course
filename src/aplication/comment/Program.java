package aplication.comment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment comment1 = new Comment("Que Legal");
		Comment comment2 = new Comment("Que foda hahahah!");

		Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		post.addComment(comment1);
		post.addComment(comment2);
		
		System.out.println(post);
	}
}