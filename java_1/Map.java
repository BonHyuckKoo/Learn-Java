package java_1;

import java.util.HashMap; // map 사용시 import 가 필요
public class Map {
	public static void main(String[] args) {
		// 자바의 map 은 파이썬의 dictionary 와 같음 // 
		// 이런자료형을 Associative, Hash 라고도  불린다
		// map 은 key 를 통해 value 를 얻어낸다
		// map 자료형에는 HashMap, LinkedHashMap, TreeMap 등이있다.
		
		   // HashMap//
		
		// key 와 value 가 String 형태인 HashMap 생성
		HashMap<String, String> map = new HashMap<String, String>(); 
		
		//put 값을 넣어준다
		map.put("people",  "사람");
		map.put("baseball",  "야구");
		map.put("school",  "학교");
		
		//get key에 해당되는 값을 얻기 위해 사용
		System.out.println(map.get("people"));
		System.out.println(map.get("People")); //없을경우 null값 반환
		
		//containsKey 맵에 키가 있는지를 조사
		System.out.println(map.containsKey("people"));
		
		//remove Map의  key 값에 해당되는 아이템(key, value)을 삭제하고 그 value 를 리턴
		System.out.println(map.remove("people"));
		
		//size Map의 개수를 리턴
		System.out.println(map.size());
		
		
		// LinkedHashMap : 입력된 순서대로 데이터가 출력
		// TreeMap : 입력된 key의 소트된 순으로 데이터가 출력
	}
}
