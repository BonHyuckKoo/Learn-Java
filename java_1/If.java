package java_1;

import java.util.ArrayList;

public class If {
	public static void main(String[] args) {
		 // if ��  (boolean ����)// 
		boolean money1 = true;
		
		if (money1) {
			System.out.println("�ýø� Ÿ�� ����");
		}else {
			System.out.println("�ɾ��");
		}
		
		// �񱳿����� // 
		int x = 3 ; 
		int y = 2 ;
		System.out.println(x > y);
		
		
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("�ý�Ÿ��");
		}else{
			System.out.println("�ɾ��");
		}
		
		
		// and(&&), or(||) , not(!)
		boolean hascard = true;
		
		if (money >= 3000 || hascard) {
			System.out.println("�ýø� Ÿ�� ����");
		}else {
			System.out.println("�ɾ��");
		}
		
		//contains
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("headphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("���ִ� �ý�Ÿ��");
		}else {
			System.out.println("������ �׳ɰ���");
		}
		
		//else if (���� ����)
		
		if (pocket.contains("money")) {
			System.out.println("�������� �ý�Ÿ��");
		}else if (hascard){ 
			System.out.println("�������� ī�尡�ִ� �ý�Ÿ��");
		}else {
			System.out.println("�پ��� �ɾ��");
		}
		
	}

}
