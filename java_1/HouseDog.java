package java_1;
  
public class HouseDog extends Dog{
	
	//������(Constructor) �޼��� //
	
	//������ ��Ģ
	//1. Ŭ������� �޼ҵ���� ����
	//2. ����Ÿ���� �������� �ʴ´�
	public HouseDog(String name) { 
		this.setName(name);
	}
	
	// �޼ҵ� �������̵� , �޼ҵ� �����ε�
	
	//sleep�� Dog Ŭ������ HouseDog Ŭ���� �� �� ������ 
	// �켱������ �� HouseDog �� �� ����
	// �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ ������ ���·� �Ǵٽ� �����ϴ����� => �޼ҵ� �������̵�(�޼ҵ� �����)
	public void sleep() {
		System.out.println(this.name+ " zzz in house");
	}
	
	// ���� �̹� sleep ��� �޼ҵ尡 ������ �Է��׸��� �ٸ���� �����̸��� �޼ҵ带 �� ������ִ�.
	// �̸� �޼ҵ� �����ε� �̶�� �Ѵ�
	public void sleep(int hour) {
		System.out.println(this.name + "zzz in house for "+ hour + " hours");
	}
	


	public static void main(String[] args) {
		  // �޼ҵ� �������̵� ,�����ε� ���� �ּ��� Ǯ�� ���� 
		
		/*HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // �޼ҵ� �������̵� ȣ��
		houseDog.sleep(3); // �޼ҵ� �����ε� ȣ��  */
		
		// ������ ȣ��// 
		HouseDog dog = new HouseDog("happy");
		System.out.println(dog.name);
		
		// �����ڸ� ���� setName�� ���� �޼��带 ������ ȣ������ �ʾƵ� �ȴٴ� ������ �ִ�
		
		
		
	}
}

// �ڹٴ� ���߻���� �������� �ʴ´�