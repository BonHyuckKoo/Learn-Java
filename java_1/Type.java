package java_1;

public class Type {
	public static void main(String[] args) {
		boolean isSuccess = true;
		boolean isTest = false;
		
		//  ���ǹ� // 
		int base = 180;
		int height = 185;
		
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("Ű��Ů�ϴ�");
		}
		
		int i = 3;
		if (i > 1) {
			System.out.println("1���� Ů�ϴ�");
		}
		// char ���ڿ� Ÿ��(�Ѱ��� ���ڰ� ǥ��) //
		
		char c1 = 'a';
		char c2 = 97;   // �ƽ�Ű�ڵ�
		char c3 = '\u0061'; // �����ڵ�
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//string ���ڿ� Ÿ��(��������) //
		
		String s1 = "Happy Java";
		String s2 = "a";
		String s3 = "123";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// ���� �Ʒ��� ������ �������� ���� �����(literalǥ��)�� �� ���� //
		//primitive(����) �ڷ��� int,long,double,float,boolean,char ���� new Ű����� �����Ұ�
		String s4 = new String("Hello Java");
		String s5 = new String("b");
		String s6 = new String("456");
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		// string �ڷ����� �޼ҵ� // 
		
		      // equals �ΰ��� ���ڿ��� �����Ѱ������� ���� //
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		     // indexOf ���ڿ����� ã����� ���ڿ��� �ε����� ��ȯ //
		
		String d = "Hello Java";

		System.out.println(d.indexOf("Java")); 
		System.out.println(d.indexOf("bye")); //�ε��� ��ã���� -1 ��ȯ	
		
		    // replaceAll ���ڿ����� Ư�� ���ڸ� �ٸ����ڷ� �ٲ� //	
		System.out.println(d.replaceAll("Java", "World"));
		System.out.println(d); // ����ü�� �ٲ��� ����
		
		    // substring ���ڿ����� Ư�� �κ��� �̾Ƴ� ��� ��� (������ġ <= d < ����ġ)//
		System.out.println(d.substring(0, 4)); //�ε��� 0 ���� 4����
		System.out.println(d.substring(4)); // 4���� ������
		
		   // toUpperCase ���ڿ��� ��� �빮�ڷ�
		System.out.println(d.toUpperCase());
		   // toLowerCase ���ڿ��� ��� �ҹ��ڷ�
		System.out.println(d.toLowerCase());
		
		
		//1. StringBuffer ���ڿ��� �߰� �ϰų� �����Ҷ� ��� //
		StringBuffer sb1 = new StringBuffer();
		
		  //append ��� �޼ҵ带 �̿��Ͽ� ���ڿ��� ��� �߰��� ����
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("jump to java");
		
		 // toString() ���� ���ڿ��� ��ȯ
		System.out.println(sb1.toString());
		System.out.println(sb1);
		
		  //2. ���� ������ �ٸ� ���� //
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
		
		  //inset Ư�� ��ġ�� ���ϴ� ���ڿ� ���� //
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("jump to java");
		sb2.insert(0, "hello "); // 0 �ε��� �ڸ��� "hello " �߰�
		System.out.println(sb2.toString());
		
		 //substring Sring�ڷ����� substring�� ���� ���� //
		
		System.out.println(sb1.substring(0, 7));
		
	}

}
