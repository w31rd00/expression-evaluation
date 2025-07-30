package core;

import java.util.Stack;

public class ExpressionCalculator {
	
	
	private final Stack<Integer> operandStack = new Stack<>();
	private final Stack<Symbol> operatorStack = new Stack<>();
	

	public int calculate(String expr) {
		for (int charIndex = 0; charIndex < expr.length(); charIndex++) {
			
			char character = expr.charAt(charIndex);
			if (Symbol.isOpeningParenthesis(character)) {
				
			} else if (Symbol.isOperator(character)) {
				this.operatorStack.push(Symbol.getSymbol(character));
			} else if (Symbol.isClosingParenthesis(character)) {
				int rightOperand = this.operandStack.pop();
				int leftOperand = this.operandStack.pop();
				Symbol operator = this.operatorStack.pop();
				this.operandStack.push(this.compute(operator, leftOperand, rightOperand));
				
			} else {
				int nextSymbolIndex = findNextSymbolIndex(charIndex, character, expr);
				this.operandStack.push(Integer.valueOf(expr.substring(charIndex, nextSymbolIndex)));
				charIndex = nextSymbolIndex-1;
			}
			
		}
		return this.operandStack.pop();
		
	}
	
	private int findNextSymbolIndex(int charIndex, char character, String expr) {
		char currentCharacter = character;
		int currentIndex = charIndex;
		
		while (!Symbol.isOperator(currentCharacter)) {
			if (Symbol.isClosingParenthesis(currentCharacter)) {
				break;
			}
			currentIndex = currentIndex + 1;
			int nextIndex = currentIndex;
			if (nextIndex < expr.length()) {
				currentCharacter = expr.charAt(nextIndex);
			}
		}
		
		return currentIndex;
	}
	
	private int compute(Symbol operator, int leftOperand, int rightOperand) {
		return ArithmeticOperation
				.getInstance(operator)
				.compute(leftOperand, rightOperand);
	}
	
	

}
