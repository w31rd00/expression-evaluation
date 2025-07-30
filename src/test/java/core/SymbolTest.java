package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTest {


    @Test
    void isOperator() {
        char addition = '+';
        char substraction = '-';
        char multiplication = '*';
        char division = '/';

        assertTrue(Symbol.isOperator(addition));
        assertTrue(Symbol.isOperator(substraction));
        assertTrue(Symbol.isOperator(multiplication));
        assertTrue(Symbol.isOperator(division));
    }

    @Test
    void isParenthesis() {
        char openParenthesis = '(';
        char closingParenthesis = ')';

        assertTrue(Symbol.isOpeningParenthesis(openParenthesis));
        assertTrue(Symbol.isClosingParenthesis(closingParenthesis));
    }


}