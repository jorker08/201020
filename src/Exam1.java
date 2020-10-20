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
			System.out.print("��ɾ �Է����ּ��� : ");
			String srt = sc.next();
			if (srt.equals("exit")) {
				System.out.println("����");
				break;
			}
			if (srt.equals("add")) {
				Article a = new Article();
				num.add(no);
				no++;
				System.out.println("�Խù� ������ ������ּ��� : ");
				String title = sc.next();
				a.title = title;
				titles.add(title);
				System.out.println("�Խù� ������ ������ּ��� : ");
				String body = sc.next();
				a.body = body;
				bodies.add(body);
				System.out.println("�Խù� ����� �Ϸ� �Ǿ����ϴ�.");
			}
			if (srt.equals("list")) {
				for (int i = 0; i < titles.size(); i++) {
					System.out.println("��ȣ : " + num.get(i));
					System.out.println("���� : " + titles.get(i));
					System.out.println("���� : " + bodies.get(i));
					System.out.println("==========================");
				}
			}
			if (srt.equals("update")) {
				System.out.println("� �Խù��� �����Ͻðڽ��ϱ�?");
				int targetId = sc.nextInt();
				 for(int i = 0; i < num.size(); i++) {
					 int id = num.get(i);
					 if(id == targetId) {
						 System.out.println("������ ������ �ּ���");
						 String newTitle = sc.next();
						 System.out.println("������ ������ �ּ���");
						 String newBody = sc.next();
						 
						 titles.set(i, newTitle);
						 bodies.set(i, newBody);
						 break;
					 }
				 }
			}
			if(srt.equals("delete")) {
				System.out.println("��Խù��� �����ұ��?");
				int targetNum = sc.nextInt();
				for(int i = 0; i < num.size(); i++) {
					int nom = num.get(i);
					if(nom == targetNum) {
						titles.remove(i);
						bodies.remove(i);
						num.remove(i);
						System.out.println("���� �Ϸ��߽��ϴ�");
						break;
					}
				}
			}

		}
	}
}
