package java_1;
/* Call.java 라는 파일 내에 Updater 클래스와 Call 클래스 2개가 등장한다
 * 여러개 클래스 선언시 예를 들어 Call.java 라는 파일명 이라면
 * Call 클래스 public 으로 선언하라는 관레(규칙) 이 있다.
 */


class Updater{
	//메소드에 값을 전달하는 경우
	// 받는 자료가 int count 여서 숫자가 증가 안됨
	public void update(int count) {
		count++;
	}
	
	//메소드에 객체를 전달하는 경우
	// update2 메소드에 Call 이라는 클래스에서 a(가명) 라는 객체를 받음
	public void update2(Call a) {
		a.count++;
	}
}

public class Call {
	int count = 0; // Call 클래스의 객체변수
	
	public static void main(String[] args) {
		// 메소드에 값을 전달하는 경우 출력
		Call myCounter = new Call(); // Call 클래스에 myCounter객체 만들기
		System.out.println("before update:"+myCounter.count);	
		
        Updater myUpdater = new Updater();// Updater 클래스에 myUpdater 만들기
        myUpdater.update(myCounter.count);
        System.out.println("after update:"+myCounter.count);
        
        // 메소드에 객체를 전달하는 경우 출력
    	Call myCounter2 = new Call(); // Call 클래스에 myCounter2객체 만들기
		System.out.println("before update:"+myCounter2.count);	
		
        Updater myUpdater2 = new Updater();// Updater 클래스에 myUpdater 만들기
        myUpdater2.update2(myCounter2);
        System.out.println("after update:"+myCounter2.count);
	}

}
