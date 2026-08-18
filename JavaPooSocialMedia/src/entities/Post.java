package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comment = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(Date date, String title, String content, Integer likes) {

		this.moment = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getDate() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " likes -\n");
		sb.append(sdf.format(moment) + "\n");
		for(int i = 0; i<comment.size(); i++) {
			sb.append(comment.get(i).getText() + "\n");
		}
		return sb.toString();
	}
	
	

}
