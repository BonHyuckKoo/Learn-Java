package java_1;

public class Array {
	public static void main(String[] args) {
		// array �� ���̴� �����Ǿ� ���� //
		
		// array ��� 1 //  
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks1= {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(weeks1);
		
		// array ��� 2 // 
		String[] weeks = new String[7]; // ���� array�� ������ ������� �Ѵ�(���� �������ָ� ����)
		weeks[0] = "��";
		weeks[1] = "��";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "ȭ";
		weeks[6] = "��";
		
		// array ���ٹ� // 
		System.out.println(weeks[1]);
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
