import java .util.Scanner;
public class Qn3{
	public static void main (String[]args){
		int participant,revenue;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter of participant");
		participant=input.nextInt();
		revenue=participant*2500;
		System.out.println("Revenue is:" + revenue);
	}
}