package core;

public class Multiplication implements ArithmeticOperation {

	@Override
	public int compute(int leftOperand, int rightOperand) {
		return leftOperand * rightOperand;
	}

}
