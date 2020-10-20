import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Article> articles = new ArrayList<>();
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
				num.add(no);
				no++;
				System.out.println("게시물 제목을 등록해주세요 : ");
				String title = sc.next();
				a.title = title;
				titles.add(title);
				System.out.println("게시물 제목을 등록해주세요 : ");
				String body = sc.next();
				a.body = body;
				bodies.add(body);
				System.out.println("게시물 등록이 완료 되었습니다.");
			}
			if (srt.equals("list")) {
				for (int i = 0; i < titles.size(); i++) {
					System.out.println("번호 : " + num.get(i));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("내용 : " + bodies.get(i));
					System.out.println("==========================");
				}
			}
			if (srt.equals("update")) {
				System.out.println("어떤 게시물을 수정하시겠습니까?");
				int targetId = sc.nextInt();
				 for(int i = 0; i < num.size(); i++) {
					 int id = num.get(i);
					 if(id == targetId) {
						 System.out.println("제목을 수정해 주세요");
						 String newTitle = sc.next();
						 System.out.println("내용을 수정해 주세요");
						 String newBody = sc.next();
						 
						 titles.set(i, newTitle);
						 bodies.set(i, newBody);
						 break;
					 }
				 }
			}
			if(srt.equals("delete")) {
				System.out.println("어떤게시물을 삭제할까요?");
				int targetNum = sc.nextInt();
				for(int i = 0; i < num.size(); i++) {
					int nom = num.get(i);
					if(nom == targetNum) {
						titles.remove(i);
						bodies.remove(i);
						num.remove(i);
						System.out.println("삭제 완료했습니다");
						break;
					}
				}
			}

		}
	}
}
