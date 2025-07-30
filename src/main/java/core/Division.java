package core;

public class Division implements ArithmeticOperation {

	@Override
	public int compute(int leftOperand, int rightOperand) {
		return leftOperand / rightOperand;
	}

}
