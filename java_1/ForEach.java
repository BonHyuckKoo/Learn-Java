package java_1;

public class ForEach {
	public static void main(String[] args) {
		// for each :������ for ���̳� ���ǽ� �κ��� ���� �ٸ�
		
		   // �Ϲ� for ��
		String[] numbers = {"one", "two", "three"};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		 
		  // for each �� ����(���̽��� for i in numbers �� ���
		for (String number : numbers) { // (type var: iterate)
			System.out.println(number);
		}
		//for each ���� ���� �ݺ�ȸ���� ��������� �ִ°��� �Ұ����ϰ� 1���ܾ� ���������� �ݺ��ɶ� ���
		
	}

}
