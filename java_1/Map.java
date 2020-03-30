package java_1;

import java.util.HashMap; // map ���� import �� �ʿ�
public class Map {
	public static void main(String[] args) {
		// �ڹ��� map �� ���̽��� dictionary �� ���� // 
		// �̷��ڷ����� Associative, Hash ���  �Ҹ���
		// map �� key �� ���� value �� ����
		// map �ڷ������� HashMap, LinkedHashMap, TreeMap �����ִ�.
		
		   // HashMap//
		
		// key �� value �� String ������ HashMap ����
		HashMap<String, String> map = new HashMap<String, String>(); 
		
		//put ���� �־��ش�
		map.put("people",  "���");
		map.put("baseball",  "�߱�");
		map.put("school",  "�б�");
		
		//get key�� �ش�Ǵ� ���� ��� ���� ���
		System.out.println(map.get("people"));
		System.out.println(map.get("People")); //������� null�� ��ȯ
		
		//containsKey �ʿ� Ű�� �ִ����� ����
		System.out.println(map.containsKey("people"));
		
		//remove Map��  key ���� �ش�Ǵ� ������(key, value)�� �����ϰ� �� value �� ����
		System.out.println(map.remove("people"));
		
		//size Map�� ������ ����
		System.out.println(map.size());
		
		
		// LinkedHashMap : �Էµ� ������� �����Ͱ� ���
		// TreeMap : �Էµ� key�� ��Ʈ�� ������ �����Ͱ� ���
	}
}
