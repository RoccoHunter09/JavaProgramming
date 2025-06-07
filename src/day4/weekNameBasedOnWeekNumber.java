package day4;

public class weekNameBasedOnWeekNumber {

	public static void main(String[] args) {
		int Week_no=9;
		if (Week_no==1) {
			System.out.println("Sunday");
			
		}
		
		else if (Week_no==2){
			System.out.println("Monday");
		}
		else if (Week_no==3){
			System.out.println("tues");
		}else if (Week_no==4){
			System.out.println("wed");
		}else if (Week_no==5){
			System.out.println("thrus");
		}else if (Week_no==6){
			System.out.println("fri");
		}else if (Week_no==7){
			System.out.println("sat");
		}
		else {
			System.out.println("Invalid week number");
		}
		

	}

}
