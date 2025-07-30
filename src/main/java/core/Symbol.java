package core;

import java.util.Arrays;
import java.util.Optional;

public enum Symbol {

	ADDITION('+', true),
	SUBTRACTION('-', true),
	MULTIPLICATION('*', true),
	DIVISION('/', true),
	OPENING_PARENTHESIS('('),
	CLOSING_PARENTHESIS(')');
	
	
	private final char sign;
	private boolean isOperator = false;
	
	Symbol(char sign) {
		this.sign = sign;
	}
	
	Symbol(char sign, boolean isOperator) {
		this(sign);
		this.isOperator = isOperator;
	}
	
	public static boolean isOperator(char character) {
		return findSymbol(character)
				.map(symbol -> symbol.isOperator)
				.orElse(false);
	}
	
	
	public static Symbol getSymbol(char character) {
		return findSymbol(character)
				.orElseThrow(() -> 
				new IllegalArgumentException(String.format("Operator: %s does not exist", character)));
		
	}
	
	private static Optional<Symbol> findSymbol(char character) {
		return Arrays.stream(Symbol.values())
				.filter(symbol -> symbol.sign == character)
				.findFirst();
	}
	
	public static boolean isOpeningParenthesis(char character) {
		return character == Symbol.OPENING_PARENTHESIS.sign;
	}
	
	public static boolean isClosingParenthesis(char character) {
		return character == Symbol.CLOSING_PARENTHESIS.sign;
	}

}
