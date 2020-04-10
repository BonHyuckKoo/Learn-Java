package Tree;

import java.util.Scanner;

public class TreeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		
		//������
		Node q1 = new Node("�����Դϱ�?");
		Node q2 = new Node("���̰� 20�� �Դϱ�?");
		Node q3 = new Node("���� ��ȭ�� �ֳ���?");
		Node q4 = new Node("���� ����ΰ���?");
		Node q5 = new Node("�������� ����ֳ���?");
		
		
		//�����
		Node a1 = new Node("������");
		Node a2 = new Node("�̰���");
		
		//�𸦰��
		Node dont = new Node("������ �����");
		
		// ��尪���� �ӽ������� ��ü
		Node que = new Node("");
		que = q1;
		
		// ���� ����(�����ºκ�) �� ����
		Object[] end = {a1,dont};
		
		//������ �� �ڸ��� ����
		q1.makeLeftSubTree(q2);
		q1.makeRightSubTree(dont);
		
		q2.makeLeftSubTree(q3);
		q2.makeRightSubTree(dont);
		q3.makeLeftSubTree(q4);
		q3.makeRightSubTree(q5);
		
		q4.makeLeftSubTree(a1);
		q4.makeRightSubTree(dont);
		q5.makeLeftSubTree(a2);
		q5.makeRightSubTree(dont);
		
		// ���α׷� ����
		System.out.println("���α׷��� �����մϴ� ");
		System.out.println("'Y' Ű�� 'N Ű�� ����� �ּ���");
		System.out.println();
		System.out.println(q1.getData());
		System.out.println("--------------------");
		
		while(true) {			

			String answer = sc.next();
			
			if (answer.equals("Y") || answer.equals("y")) {
				if(que.left == null) {
					System.out.println("���� ������");
					break;
				}
				que = que.getLeftSubTree();
				System.out.println(que.getData());
				System.out.println("--------------------");
			}	
			else if (answer.equals("N") || answer.equals("n")){
				if(que.right == null) {
					System.out.println("���� ������");
					break;
				}
				que = que.getRightSubTree();
				System.out.println(que.getData());
				System.out.println("--------------------");			
			}
			else if(que == dont || que == a1 || que == a2) {
				System.out.println(que.getData());
				System.out.println("--------------------");
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else {
				System.out.println("Ű�� �߸��Է��ϼ˽��ϴ�.");
				System.out.println("--------------------");
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			
		}
	}
}
