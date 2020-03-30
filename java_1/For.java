package java_1;

public class For {
	public static void main(String[] args) {
		String[] numbers = {"one" ,"two" , "three"};
		
		// 기본 for 문
		for (int i=0; i < numbers.length; i++) { //(초기치 ; 조건문 ; 증가치)
			System.out.println(numbers[i]);
		}
		
		
		// 예제: 점수 구별
		int[] marks = {90, 25, 67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1) + "번 학생은 합격입니다.");
			}else {
				System.out.println((i+1) + "번 학생은 불합격입니다.");
			}
		}
		
		//for와 continue
		for (int i=0; i<marks.length; i++) {
			if (marks[i] > 60) {
				System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.") ;
			}else {
				continue;
			}
		}
		
		// for를 이용한 구구단
		for (int i=2; i < 10; i ++) {
			for (int j=1; j < 10 ; j++) {
				System.out.print(i*j + " "); 
			}   // System.out.print 개행없이 출력 (가로로출력)
			System.out.println("");// 구구단 한단이 끝날때마다 줄바꿈
		}
	}
}
