package java_1;

import java.util.ArrayList;

public class If {
	public static void main(String[] args) {
		 // if 문  (boolean 형태)// 
		boolean money1 = true;
		
		if (money1) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		// 비교연산자 // 
		int x = 3 ; 
		int y = 2 ;
		System.out.println(x > y);
		
		
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("택시타자");
		}else{
			System.out.println("걸어가자");
		}
		
		
		// and(&&), or(||) , not(!)
		boolean hascard = true;
		
		if (money >= 3000 || hascard) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//contains
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("headphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("돈있다 택시타자");
		}else {
			System.out.println("돈없다 그냥가자");
		}
		
		//else if (다중 조건)
		
		if (pocket.contains("money")) {
			System.out.println("돈잇으니 택시타자");
		}else if (hascard){ 
			System.out.println("돈없으나 카드가있다 택시타자");
		}else {
			System.out.println("다없다 걸어가자");
		}
		
	}

}
