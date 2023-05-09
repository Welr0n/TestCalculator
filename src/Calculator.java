import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private Map<Character, OperationPerformer> performersByOperator;

    public Calculator(Map<Character, OperationPerformer> performersByOperator) {
        this.performersByOperator = performersByOperator;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File Input = new File("inputData");
        File Output = new File("outputData");

        Scanner input = new Scanner(Input);
        PrintWriter output = new PrintWriter(Output);

        Calculator calculator = CalculatorOperations.baseOperations();

        while (input.hasNext()) {
            char curOperation = input.next().charAt(0);
            int firstNum = input.nextInt();
            int secondNum = input.nextInt();

            int result = calculator.performersByOperator.get(curOperation).calculate(firstNum,secondNum);
            output.println(result);
        }

        input.close();
        output.close();
    }
}