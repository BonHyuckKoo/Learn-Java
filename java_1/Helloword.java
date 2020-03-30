package java_1;

/*            블록 주석
  프로그램 저작권 
  
  이 프래고름의 저작권은 구본혁 에게 있습니다.
 
 */
public class Helloword { // class Helloword 파이썬에서 파일 이름이라 보면됨
	public static void main(String[] args) {
		
		// 문자열 출력 // 
		String a = "1"; // 라인 주석 
		String b = "hello java";		
		System.out.println(a + b);
		
		// 사칙 연산 //		
		int c = 3;
		int d = 2;
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d); // int 형이라 소수점 표시안됨
		System.out.println(c%d);
		
		//증감 연산자//
		
		c ++;   
		d ++;
		System.out.println(c);
		System.out.println(d);
		
		c --;   
		d --;
		System.out.println(c);
		System.out.println(d);
		
		// 실수 표현(float, double) //
		float fl1 = 3/2 ;  //  같은 값 이어도 끝에 f 를 안붙이면 1로 출력
	 	    //float f1 = 1.5 로 출력시 오류 => float f1 = 1.5f 로 해야함
		float fl2 = 3/2f ; //  1.5 출력
		System.out.println(fl1);
		System.out.println(fl2);
		
		
		double db1 = 123.456; // float 와 다르게  그대로 출력
		double db2 = 123.456e2; // e2의 옮기는 자리수의 의미 -값일시 한자리씩 감소
		System.out.println(db1);
		System.out.println(db2);
	}
}
