import java.util.Scanner;
public class Qn5{
	public static void main(String[]args){
		int egg,dozen,gross,abov_gross;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		egg=input.nextInt();
		gross=(egg/144);
		abov_gross=(egg%144);
		dozen=(abov_gross/12);
		egg=(abov_gross%12);
		
		System.out.println("Your number of eggs is"+" "+gross+" "+"gross"+","+" "
			+dozen+" "+"dozen"+","+" "+"and"+" "+egg);


	}
}