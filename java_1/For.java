package java_1;

public class For {
	public static void main(String[] args) {
		String[] numbers = {"one" ,"two" , "three"};
		
		// �⺻ for ��
		for (int i=0; i < numbers.length; i++) { //(�ʱ�ġ ; ���ǹ� ; ����ġ)
			System.out.println(numbers[i]);
		}
		
		
		// ����: ���� ����
		int[] marks = {90, 25, 67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1) + "�� �л��� �հ��Դϴ�.");
			}else {
				System.out.println((i+1) + "�� �л��� ���հ��Դϴ�.");
			}
		}
		
		//for�� continue
		for (int i=0; i<marks.length; i++) {
			if (marks[i] > 60) {
				System.out.println((i+1) + "�� �л� �����մϴ�. �հ��Դϴ�.") ;
			}else {
				continue;
			}
		}
		
		// for�� �̿��� ������
		for (int i=2; i < 10; i ++) {
			for (int j=1; j < 10 ; j++) {
				System.out.print(i*j + " "); 
			}   // System.out.print ������� ��� (���η����)
			System.out.println("");// ������ �Ѵ��� ���������� �ٹٲ�
		}
	}
}
