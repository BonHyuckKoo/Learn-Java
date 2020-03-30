package java_1;

public class Animal{ 	
	///////////////////// 클래스 설계 부분 ////////////////
	
	
	//Animal cat = new Animal(); 	// Animal 클래스에 cat이라는 객체를 생성
							     	// 이때 cat은 Animal 클래스의 인스턴스
	String name; // Animal 클래스의 name 이라는 변수를 선언 => 객체 변수
	// 속성 , 멤버변수 , 인스턴스변수 라고도 함	
	// 객체변수는 공유되지 않음
	
	
	//클래스에 의해 생성된것 => 객체  |  클래스에 선언된 변수 => 객체 변수
	
	
	
	 // 메소드 : 클래스 내에서 구현된 함수 //    
	 // setName 메소드를 Animal 클래스에 추가 // 
	public void setName(String a) { // void: 리턴값 없음 String name : 입력값
		                            //(String a)에  들어갈 이름이 문자열로 저장
		this.name = a;
		
		// 여기서 this 는 Animal클래스에 의해서 생성된 객체를 지칭
        //즉 cat.name = a 라는 매개변수 
		
		
    // 즉 입력으로 name 이라는 문자열을 받고 출력은 없는 형태		
	}	

	
	
	
	///////////// 실제 구현 부분 ///////////////
	 public static void main(String[] args) {
		 Animal cat = new Animal();
	     System.out.println(cat.name); // 객체변수 사용법 객체.객체변수
		// 객체 변수 name 을 사용했지만 값이 할당되지 않아 null 출력
	     
	    cat.setName("body"); // 메소드 호출: 객체.메소드
	    System.out.println(cat.name);
	    
	    
	    Animal dog = new Animal();
	    dog.setName("happy");
	    System.out.println(dog.name);
	     
	     
	 
	}
}
