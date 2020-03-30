package java_1;             // 상속 // 

public class Dog extends Animal { // Dog 클래스는 Animal 클래스를 상속한다
								  // 자식클래스 extends 부모클래스
	
	// default 생성자
	// 생성자인데 입력항목이 없고 생성자 내부에 아무내용이 없는 것
	
	/*아래와 같이 구현하면 new Dog()로 Dog 객체가 만들어질때 아래 생성자가 실행
	 * 만일 클래스에 생성자가 없으면 컴파일러는 아래와같은 default생성자를 추가함
	 * 
	 * 
	 */
	
	 public Dog(){
	 }
	 
	
	public void sleep() {
		System.out.println(this.name+" zzz" + " 잠을잡니다");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		// Dog  클래스에서 setName메소드를 안만들었지만 상속으로인해 Dog 클래스도 사용가능
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		
		
				
		/*  객체 선언시
		 *  Animal dog = new Dog(); 는 가능하나
		 *  (개로 만든 객체는 동물 자료형이다)
		 *  Dog dog = new Animal(); 는 불가능
		 *  (동물로 만든 객체는 개 자료형이다)
		 *  부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용불가
		  */	
		
	}		 
}

