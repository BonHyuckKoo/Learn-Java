package java_1;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
	      // ����Ʈ�� ���̴� ���������� �ʴ� // 
		  // list // 
		
		// �� ����Ʈ�� �� �߰� // 
		ArrayList list1 = new ArrayList(); // �� ����Ʈ ����
		list1.add("123"); // �� �߰�
		list1.add("456");
		list1.add("789");
		
		// get ����Ʈ���� Ư�� �ε������� ����
		System.out.println(list1.get(2));
		
		// size ArrayList�� ������ ����
		System.out.println(list1.size());
		
		// contains ����Ʈ �ȿ� �׸��� �ִ����� �Ǵ�
		System.out.println(list1.contains("123"));
		System.out.println(list1.contains("489"));
		
		//remove (��ü or index) �׸��� �����ϰ� ������ ����� ����
		System.out.println(list1.remove("123")); // ��ü�� ������ true or false�� ��ȯ
		System.out.println(list1.remove(0)); //�ε����� ������ ������ �ε��� �׸��� ����
		
		
		
		   // Generics ���׸��� // 
		ArrayList<String> list2 = new ArrayList<String>(); 
		// <String> �̶�� ���׸��� ǥ������ "ArrayList" �ȿ� �������մ� �ڷ����� 
		// String Ÿ�� ���̴� ��°��� �ǹ�(<Integer>, <Animal>, <Dog> �� ��밡��>
		// �� ���׸��� ���� ���� ��Ȯ�� Ÿ��üũ�� ��������
		
		
	/*	ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");

		String hello = (String) aList.get(0);
		String java = (String) aList.get(1); */
		
		// ��ó�� ���� ���� �������� ������ �ȵ����� ���� �����ð��� �׻� ���ϴ� �ڷ����� ĳ������ �������
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hello");
		aList.add("java");

		String hello = aList.get(0);
		String java = aList.get(1);
		
		// ���ʹ� �ٸ��� ���׸��� ����  ĳ������ �ʿ����
	}
}
