package java_1;

/*            ��� �ּ�
  ���α׷� ���۱� 
  
  �� �������� ���۱��� ������ ���� �ֽ��ϴ�.
 
 */
public class Helloword { // class Helloword ���̽㿡�� ���� �̸��̶� �����
	public static void main(String[] args) {
		
		// ���ڿ� ��� // 
		String a = "1"; // ���� �ּ� 
		String b = "hello java";		
		System.out.println(a + b);
		
		// ��Ģ ���� //		
		int c = 3;
		int d = 2;
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d); // int ���̶� �Ҽ��� ǥ�þȵ�
		System.out.println(c%d);
		
		//���� ������//
		
		c ++;   
		d ++;
		System.out.println(c);
		System.out.println(d);
		
		c --;   
		d --;
		System.out.println(c);
		System.out.println(d);
		
		// �Ǽ� ǥ��(float, double) //
		float fl1 = 3/2 ;  //  ���� �� �̾ ���� f �� �Ⱥ��̸� 1�� ���
	 	    //float f1 = 1.5 �� ��½� ���� => float f1 = 1.5f �� �ؾ���
		float fl2 = 3/2f ; //  1.5 ���
		System.out.println(fl1);
		System.out.println(fl2);
		
		
		double db1 = 123.456; // float �� �ٸ���  �״�� ���
		double db2 = 123.456e2; // e2�� �ű�� �ڸ����� �ǹ� -���Ͻ� ���ڸ��� ����
		System.out.println(db1);
		System.out.println(db2);
	}
}
