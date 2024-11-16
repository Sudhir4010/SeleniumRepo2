package RevisionModule1;

public class LeapYear {
	public static void main(String[] args) {
		int year=2016;
		if((year%400==0)||(year%4==0 && year%100!=0)){
			System.out.println("Given year is a leap year");
		}
		else {
			System.out.println("Given year is not leap year");
		}
	}

}
