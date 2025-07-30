package core;

public class Subtraction implements ArithmeticOperation {

	@Override
	public int compute(int leftOperand, int rightOperand) {
		return leftOperand - rightOperand;
	}

}
