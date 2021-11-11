import java.util.Scanner;
class MinsToYearsDays{
	public static void main(String[]args){
	int minutes,day_minutes,year,year_minutes,days;
	Scanner input=new Scanner(System.in);
	System.out.println("Entre minutes");
	minutes=input.nextInt();
	day_minutes=(60*24);
	year_minutes=(60*24*365);
	year=(minutes/year_minutes);
	days=(minutes%year_minutes)/day_minutes;
	System.out.println("Minutes per years is:"+year);
	System.out.println("Minutes per days is:" +days);
	}
}