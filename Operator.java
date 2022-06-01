package Week2;

interface Operator {
	public double operate(double num1, double num2);
}

class Add implements Operator {
	public double operate(double num1, double num2) {
		return num1 + num2;
	}
}

class Sub implements Operator {
	public double operate(double num1, double num2) {
		return num1 - num2;
	}
}

class Mul implements Operator {
	public double operate(double num1, double num2) {
		return num1 * num2;
	}
}

class Div implements Operator {
	public double operate(double num1, double num2) {
		return num1 / num2;
	}
}