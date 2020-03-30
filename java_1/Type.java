package java_1;

public class Type {
	public static void main(String[] args) {
		boolean isSuccess = true;
		boolean isTest = false;
		
		//  조건뮨 // 
		int base = 180;
		int height = 185;
		
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("키가큽니다");
		}
		
		int i = 3;
		if (i > 1) {
			System.out.println("1보다 큽니다");
		}
		// char 문자열 타입(한개의 문자값 표현) //
		
		char c1 = 'a';
		char c2 = 97;   // 아스키코드
		char c3 = '\u0061'; // 유니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//string 문자열 타입(여러문자) //
		
		String s1 = "Happy Java";
		String s2 = "a";
		String s3 = "123";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 위나 아래나 같으나 가독성을 위해 위방식(literal표기)이 더 좋디 //
		//primitive(원시) 자료형 int,long,double,float,boolean,char 등은 new 키워드로 생성불가
		String s4 = new String("Hello Java");
		String s5 = new String("b");
		String s6 = new String("456");
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		// string 자료형의 메소드 // 
		
		      // equals 두개의 문자열이 동일한값인지를 리턴 //
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		     // indexOf 문자열에서 찾고싶은 문자열의 인덱스값 반환 //
		
		String d = "Hello Java";

		System.out.println(d.indexOf("Java")); 
		System.out.println(d.indexOf("bye")); //인덱스 못찾을시 -1 반환	
		
		    // replaceAll 문자열에서 특정 문자를 다른문자로 바꿈 //	
		System.out.println(d.replaceAll("Java", "World"));
		System.out.println(d); // 값자체가 바뀌진 않음
		
		    // substring 문자열에서 특정 부분을 뽑아낼 경우 사용 (시작위치 <= d < 끝위치)//
		System.out.println(d.substring(0, 4)); //인덱스 0 에서 4까지
		System.out.println(d.substring(4)); // 4부터 끝까지
		
		   // toUpperCase 문자열을 모두 대문자로
		System.out.println(d.toUpperCase());
		   // toLowerCase 문자열을 모두 소문자로
		System.out.println(d.toLowerCase());
		
		
		//1. StringBuffer 문자열을 추가 하거나 변경할때 사용 //
		StringBuffer sb1 = new StringBuffer();
		
		  //append 라는 메소드를 이용하여 문자열을 계속 추가해 나감
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("jump to java");
		
		 // toString() 으로 문자열로 변환
		System.out.println(sb1.toString());
		System.out.println(sb1);
		
		  //2. 위와 같으나 다른 예제 //
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
		
		  //inset 특정 위치에 원하는 문자열 삽입 //
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("jump to java");
		sb2.insert(0, "hello "); // 0 인덱스 자리에 "hello " 추가
		System.out.println(sb2.toString());
		
		 //substring Sring자료형의 substring과 사용법 동일 //
		
		System.out.println(sb1.substring(0, 7));
		
	}

}
