
public class Article {
	private int num;
	private String title;
	private String body;
	
	
	public Article(int id, String title, String body) {
		this.num = id;
		this.title = title;
		this.body = body;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
