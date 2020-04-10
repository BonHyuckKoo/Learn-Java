package Tree;

import java.util.Scanner;

public class TreeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 노드들 선언
		
		//질문들
		Node q1 = new Node("남자입니까?");
		Node q2 = new Node("나이가 20대 입니까?");
		Node q3 = new Node("현재 강화에 있나요?");
		Node q4 = new Node("현재 백수인가요?");
		Node q5 = new Node("구래동에 살고있나요?");
		
		
		//정답들
		Node a1 = new Node("구본혁");
		Node a2 = new Node("이강진");
		
		//모를경우
		Node dont = new Node("누군지 몰라용");
		
		// 노드값들이 임시저장할 객체
		Node que = new Node("");
		que = q1;
		
		// 최종 정답(끝나는부분) 의 모임
		Object[] end = {a1,dont};
		
		//노드들을 각 자리에 배정
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
		
		// 프로그램 구현
		System.out.println("프로그램을 시작합니다 ");
		System.out.println("'Y' 키와 'N 키로 대답해 주세요");
		System.out.println();
		System.out.println(q1.getData());
		System.out.println("--------------------");
		
		while(true) {			

			String answer = sc.next();
			
			if (answer.equals("Y") || answer.equals("y")) {
				if(que.left == null) {
					System.out.println("아직 구현중");
					break;
				}
				que = que.getLeftSubTree();
				System.out.println(que.getData());
				System.out.println("--------------------");
			}	
			else if (answer.equals("N") || answer.equals("n")){
				if(que.right == null) {
					System.out.println("아직 구현중");
					break;
				}
				que = que.getRightSubTree();
				System.out.println(que.getData());
				System.out.println("--------------------");			
			}
			else if(que == dont || que == a1 || que == a2) {
				System.out.println(que.getData());
				System.out.println("--------------------");
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("키를 잘못입력하셧습니다.");
				System.out.println("--------------------");
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
		}
	}
}
