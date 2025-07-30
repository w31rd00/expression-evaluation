package core;

public interface ArithmeticOperation {
	
	int compute(int leftOperand, int rightOperand);
	
	static ArithmeticOperation getInstance(Symbol operator) {
		return switch (operator) {
			case ADDITION -> new Addition();
			case SUBTRACTION -> new Subtraction();
			case MULTIPLICATION -> new Multiplication();
			case DIVISION -> new Division();
			default -> throw new IllegalStateException();
		};
	}

}
