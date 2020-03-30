package java_1;

public class ForEach {
	public static void main(String[] args) {
		// for each :동일한 for 문이나 조건식 부분이 조금 다름
		
		   // 일반 for 문
		String[] numbers = {"one", "two", "three"};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		 
		  // for each 로 변경(파이썬의 for i in numbers 와 비슷
		for (String number : numbers) { // (type var: iterate)
			System.out.println(number);
		}
		//for each 문은 따로 반복회수를 명시적으로 주는것이 불가능하고 1스텝씩 순차적으로 반복될때 사용
		
	}

}
