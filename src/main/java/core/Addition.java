package core;

public class Addition implements ArithmeticOperation {

	@Override
	public int compute(int leftOperand, int rightOperand) {
		return leftOperand + rightOperand;
	}

}
