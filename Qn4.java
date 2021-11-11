import java .util.Scanner;
public class Qn4{
	public static void main (String[]args){
		int no_of_gallons,no_of_miles,totalmiles;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Gallons");
		no_of_gallons=input.nextInt();
		System.out.println("Enter number of Miles");
		no_of_miles=input.nextInt();
		totalmiles=no_of_gallons*no_of_miles;
		System.out.println("The total Miles is:" + totalmiles);

	}
}