import java .util.Scanner;
public class Qn6{
	public static void main (String[]args){
	int performance;
	int salary;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Performance level");
	performance=input.nextInt();
	System.out.println("Enter Salary");
	salary=input.nextInt();
	if(performance>=90){
		System.out.println("Increasing Salary is:" + (salary+(0.03*salary)));
		}else{
			System.out.println("The Salary is:" + salary);
		}

	}
}