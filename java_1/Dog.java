package java_1;             // ��� // 

public class Dog extends Animal { // Dog Ŭ������ Animal Ŭ������ ����Ѵ�
								  // �ڽ�Ŭ���� extends �θ�Ŭ����
	
	// default ������
	// �������ε� �Է��׸��� ���� ������ ���ο� �ƹ������� ���� ��
	
	/*�Ʒ��� ���� �����ϸ� new Dog()�� Dog ��ü�� ��������� �Ʒ� �����ڰ� ����
	 * ���� Ŭ������ �����ڰ� ������ �����Ϸ��� �Ʒ��Ͱ��� default�����ڸ� �߰���
	 * 
	 * 
	 */
	
	 public Dog(){
	 }
	 
	
	public void sleep() {
		System.out.println(this.name+" zzz" + " ������ϴ�");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		// Dog  Ŭ�������� setName�޼ҵ带 �ȸ�������� ����������� Dog Ŭ������ ��밡��
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		
		
				
		/*  ��ü �����
		 *  Animal dog = new Dog(); �� �����ϳ�
		 *  (���� ���� ��ü�� ���� �ڷ����̴�)
		 *  Dog dog = new Animal(); �� �Ұ���
		 *  (������ ���� ��ü�� �� �ڷ����̴�)
		 *  �θ� Ŭ������ ���� ��ü�� �ڽ� Ŭ������ �ڷ������� ���Ұ�
		  */	
		
	}		 
}

