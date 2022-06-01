package professor;
import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringStack ststack = new StringStack();
		String str[];
		boolean judge;
		
		System.out.print(">>");
		judge = ststack.push(sc.nextLine());
		if(judge == false)
			System.out.println("문장 길이 초과");
		
		for(int i = ststack.length(); i > 0; i--) {
			System.out.print(ststack.pop() + " ");
		}
	}

}
//Intelligent Networking and Security Lab