package professor;

abstract class Stack {
	abstract int length();
	abstract String pop();
	abstract boolean push(String ob);
}


class StringStack extends Stack { //FILO
	String str[]; // 문자열 5개
	int num = 0;
	
	int length() {
		num = str.length;
		return num;
	}
	
	String pop() {
		if(num <= 0) {
			System.out.println("실행 불가");
			return "";
		}
		else {
			num--;
			return str[num];
		}
	}
	
	boolean push(String ob) {
		str = ob.split(" ");
		if(str.length < 5)
			return false;
		else
			return true;
	}
}