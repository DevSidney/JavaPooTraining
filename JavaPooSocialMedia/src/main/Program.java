package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow, that's awesome");

		Post p1 = new Post(sdf.parse("21/12/2023 09:54:32"), "My firt travel in a while", "this is going to be the best vacation ever", 12);
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);
			
		sc.close();
	}
}
