package adapters.console;

import core.ExpressionCalculator;

import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        while (reader.hasNextLine()) {
            String userInputExpression = reader.nextLine();
            int value = calculator.calculate(userInputExpression);
            System.out.println(value);
        }
    }


}
