package java_1;

public class Array {
	public static void main(String[] args) {
		// array 의 길이는 고정되어 있음 //
		
		// array 방법 1 //  
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks1= {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks1);
		
		// array 방법 2 // 
		String[] weeks = new String[7]; // 먼저 array의 범위를 정해줘야 한다(범위 안정해주면 오류)
		weeks[0] = "일";
		weeks[1] = "토";
		weeks[2] = "금";
		weeks[3] = "목";
		weeks[4] = "수";
		weeks[5] = "화";
		weeks[6] = "월";
		
		// array 접근법 // 
		System.out.println(weeks[1]);
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
