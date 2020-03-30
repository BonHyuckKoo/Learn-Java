package java_1;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
	      // 리스트의 길이는 정해져있지 않다 // 
		  // list // 
		
		// 빈 리스트에 값 추가 // 
		ArrayList list1 = new ArrayList(); // 빈 리스트 생성
		list1.add("123"); // 값 추가
		list1.add("456");
		list1.add("789");
		
		// get 리스트안의 특정 인덱스값을 추출
		System.out.println(list1.get(2));
		
		// size ArrayList의 개수를 리턴
		System.out.println(list1.size());
		
		// contains 리스트 안에 항목값이 있는지를 판단
		System.out.println(list1.contains("123"));
		System.out.println(list1.contains("489"));
		
		//remove (객체 or index) 항목을 삭제하고 삭제한 결과를 리턴
		System.out.println(list1.remove("123")); // 객체로 삭제시 true or false로 반환
		System.out.println(list1.remove(0)); //인덱스로 삭제시 삭제된 인덱스 항목을 리턴
		
		
		
		   // Generics 제네릭스 // 
		ArrayList<String> list2 = new ArrayList<String>(); 
		// <String> 이라는 제네릭스 표현식은 "ArrayList" 안에 담을수잇는 자료형은 
		// String 타입 뿐이다 라는것을 의미(<Integer>, <Animal>, <Dog> 등 사용가능>
		// 즉 제네릭스 사용시 좀더 명확한 타입체크가 가능해짐
		
		
	/*	ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");

		String hello = (String) aList.get(0);
		String java = (String) aList.get(1); */
		
		// 위처럼 사용시 값을 넣을때는 문제가 안되지만 값을 가져올경우는 항상 원하는 자료형을 캐스팅을 해줘야함
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hello");
		aList.add("java");

		String hello = aList.get(0);
		String java = aList.get(1);
		
		// 위와는 다르게 제네릭스 사용시  캐스팅이 필요없음
	}
}
