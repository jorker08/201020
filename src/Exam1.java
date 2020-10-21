import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Article> articles = new ArrayList<>();
		Article a1 = new Article(1, "제목1", "내용1");
		Article a2 = new Article(1, "제목1", "내용1");
		Article a3 = new Article(1, "제목1", "내용1");
		
		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		
		
		int no = 1;

		while (true) {
			System.out.print("명령어를 입력해주세요 : ");
			String srt = sc.next();
			if (srt.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (srt.equals("add")) {
				Article a = new Article();

				a.setNum(no);
				no++;
				System.out.println("게시물 제목을 등록해주세요 : ");
				String title = sc.next();
				a.setTitle(title);
				System.out.println("게시물 내용을 등록해주세요 : ");
				String body = sc.next();
				a.setBody(body);
				System.out.println("게시물 등록이 완료 되었습니다");

				articles.add(a);
			}
			if (srt.equals("list")) {

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					System.out.println("번호 : " + article.getNum());
					System.out.println("제목 : " + article.getTitle());
					System.out.println("==========================");
				}
			}
			if (srt.equals("update")) {
				System.out.println("수정할 게시물을 선택해주세요");
				int targetId = sc.nextInt();
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					int id = article.getNum();
					if (id == targetId) {
						System.out.println("제목을 수정해 주세요");
						String newTitle = sc.next();
						System.out.println("내용을 수정해 주세요");
						String newBody = sc.next();

						Article newArticle = new Article();
						newArticle.setNum(id);
						newArticle.setTitle(newTitle);
						newArticle.setBody(newBody);

						articles.set(i, newArticle);
						System.out.println("수정하였습니다");
						break;
					}
				}
			}
			if (srt.equals("delete")) {
				System.out.println("삭제할 게시물을 선택해주세요");
				int targetNum = sc.nextInt();
				int fleg = 2; // 1.있음 2.없음
				for (int i = 0; i < articles.size(); i++) {
					int nom = articles.get(i).getNum();
					if (nom == targetNum) {
						fleg = 1;
						articles.remove(i);

						break;
					}
				}
				if (fleg == 2) {
					System.out.println("해당게시물은 없습니다");
				} else {
					System.out.println("삭제 완료했습니다");
				}
			}
			if (srt.equals("read")) {
				System.out.println("보실 게시물을 선택해주세요");
				int targetNum = sc.nextInt();
				int fleg = 2;
				for (int i = 0; i < articles.size(); i++) {
					int num = articles.get(i).getNum();
					if (num == targetNum) {
						fleg = 1;
						System.out.println(targetNum + "번 상세내용");
						System.out.println("번호 : " + articles.get(i).getNum());
						System.out.println("제목 : " + articles.get(i).getTitle());
						System.out.println("내용 : " + articles.get(i).getBody());
						break;
					}
				}
				if (fleg == 2) {
					System.out.println("해당게시물은 없습니다");
				}
			}

		}
	}
	public static void getArticleIndexById(int num) {
		
	}
}
