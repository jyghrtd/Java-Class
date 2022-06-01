package Week2;
import java.util.Scanner;

public class QuestionCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Add: " + add.operate(a, b));
		System.out.println("Sub: " + sub.operate(a, b));
		System.out.println("Mul: " + mul.operate(a, b));
		System.out.println("Div: " + div.operate(a, b));
	}

}
