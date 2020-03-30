package java_1;
  
public class HouseDog extends Dog{
	
	//생성자(Constructor) 메서드 //
	
	//생성자 규칙
	//1. 클래스명과 메소드명이 동일
	//2. 리턴타입을 정의하지 않는다
	public HouseDog(String name) { 
		this.setName(name);
	}
	
	// 메소드 오버라이딩 , 메소드 오버로딩
	
	//sleep은 Dog 클래스와 HouseDog 클래스 에 다 있지만 
	// 우선순위가 가 HouseDog 가 더 높다
	// 부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는행위 => 메소드 오버라이딩(메소드 덮어쓰기)
	public void sleep() {
		System.out.println(this.name+ " zzz in house");
	}
	
	// 위에 이미 sleep 라는 메소드가 있지만 입력항목이 다른경우 같은이름의 메소드를 또 만들수있다.
	// 이를 메소드 오버로딩 이라고 한다
	public void sleep(int hour) {
		System.out.println(this.name + "zzz in house for "+ hour + " hours");
	}
	


	public static void main(String[] args) {
		  // 메소드 오버라이딩 ,오버로딩 예는 주석을 풀고 실행 
		
		/*HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // 메소드 오버라이딩 호출
		houseDog.sleep(3); // 메소드 오버로딩 호출  */
		
		// 생성자 호출// 
		HouseDog dog = new HouseDog("happy");
		System.out.println(dog.name);
		
		// 생성자를 사용시 setName과 같은 메서드를 일일히 호출하지 않아도 된다는 장점이 있다
		
		
		
	}
}

// 자바는 다중상속을 지원하지 않는다