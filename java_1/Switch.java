package java_1;

public class Switch {
	public static void main(String[] args) {
		int month = 8;
		String monthString = "";
		
		switch (month) {
		case 1: monthString = "Janeary";
				break;
		case 2: monthString = "February";
				break;
		case 3: monthString = "March";
				break;
		case 4: monthString = "April";
				break;
		case 5: monthString = "May";
				break;
		case 6: monthString = "June";
				break;
		case 7: monthString = "July";
				break;
		case 8: monthString = "August";
				break;
		case 9: monthString = "Setember";
				break;
		case 10: monthString = "October";
				break;
		case 11: monthString = "November";
				break;
		case 12: monthString = "December";
				break;
		default : monthString = "Invalid month"; // 1에서 12가 아닌 다른값이 나오면 출력
				break;
		}
		
		System.out.println(monthString);
	}

}
