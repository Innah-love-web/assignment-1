import java.util.Scanner;
public class Qn2{
	public static void main (String[]args){
		String name,city,college,profession,animal,petname = new String();
		int age;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		name=input.next();
		System.out.println("Enter your city");
		city=input.next();
		System.out.println("Enter your college");
		college=input.next();
		System.out.println("Enter your profession");
		profession=input.next();
		System.out.println("Enter your animal");
		animal=input.next();
		System.out.println("Enter your petname");
		petname=input.next();
		System.out.println("Enter your age");
		age=input.nextInt();
		System.out.println("There once was a person named"+" "+name+" "+"who lived in"+" "+city+".");
		System.out.println("At the age of"+" "+age+" "+name+" "+"went to the college at"+" "+college+".");
		System.out.println(name+" "+"graduate and went to work as"+" "+profession+" "+"profession");
		System.out.println("adopted a"+" "+animal+" "+"named"+petname+" "+" they both lived happily ever after");

	}
}