package java_1;
/* Call.java ��� ���� ���� Updater Ŭ������ Call Ŭ���� 2���� �����Ѵ�
 * ������ Ŭ���� ����� ���� ��� Call.java ��� ���ϸ� �̶��
 * Call Ŭ���� public ���� �����϶�� ����(��Ģ) �� �ִ�.
 */


class Updater{
	//�޼ҵ忡 ���� �����ϴ� ���
	// �޴� �ڷᰡ int count ���� ���ڰ� ���� �ȵ�
	public void update(int count) {
		count++;
	}
	
	//�޼ҵ忡 ��ü�� �����ϴ� ���
	// update2 �޼ҵ忡 Call �̶�� Ŭ�������� a(����) ��� ��ü�� ����
	public void update2(Call a) {
		a.count++;
	}
}

public class Call {
	int count = 0; // Call Ŭ������ ��ü����
	
	public static void main(String[] args) {
		// �޼ҵ忡 ���� �����ϴ� ��� ���
		Call myCounter = new Call(); // Call Ŭ������ myCounter��ü �����
		System.out.println("before update:"+myCounter.count);	
		
        Updater myUpdater = new Updater();// Updater Ŭ������ myUpdater �����
        myUpdater.update(myCounter.count);
        System.out.println("after update:"+myCounter.count);
        
        // �޼ҵ忡 ��ü�� �����ϴ� ��� ���
    	Call myCounter2 = new Call(); // Call Ŭ������ myCounter2��ü �����
		System.out.println("before update:"+myCounter2.count);	
		
        Updater myUpdater2 = new Updater();// Updater Ŭ������ myUpdater �����
        myUpdater2.update2(myCounter2);
        System.out.println("after update:"+myCounter2.count);
	}

}
