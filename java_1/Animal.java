package java_1;

public class Animal{ 	
	///////////////////// Ŭ���� ���� �κ� ////////////////
	
	
	//Animal cat = new Animal(); 	// Animal Ŭ������ cat�̶�� ��ü�� ����
							     	// �̶� cat�� Animal Ŭ������ �ν��Ͻ�
	String name; // Animal Ŭ������ name �̶�� ������ ���� => ��ü ����
	// �Ӽ� , ������� , �ν��Ͻ����� ��� ��	
	// ��ü������ �������� ����
	
	
	//Ŭ������ ���� �����Ȱ� => ��ü  |  Ŭ������ ����� ���� => ��ü ����
	
	
	
	 // �޼ҵ� : Ŭ���� ������ ������ �Լ� //    
	 // setName �޼ҵ带 Animal Ŭ������ �߰� // 
	public void setName(String a) { // void: ���ϰ� ���� String name : �Է°�
		                            //(String a)��  �� �̸��� ���ڿ��� ����
		this.name = a;
		
		// ���⼭ this �� AnimalŬ������ ���ؼ� ������ ��ü�� ��Ī
        //�� cat.name = a ��� �Ű����� 
		
		
    // �� �Է����� name �̶�� ���ڿ��� �ް� ����� ���� ����		
	}	

	
	
	
	///////////// ���� ���� �κ� ///////////////
	 public static void main(String[] args) {
		 Animal cat = new Animal();
	     System.out.println(cat.name); // ��ü���� ���� ��ü.��ü����
		// ��ü ���� name �� ��������� ���� �Ҵ���� �ʾ� null ���
	     
	    cat.setName("body"); // �޼ҵ� ȣ��: ��ü.�޼ҵ�
	    System.out.println(cat.name);
	    
	    
	    Animal dog = new Animal();
	    dog.setName("happy");
	    System.out.println(dog.name);
	     
	     
	 
	}
}
