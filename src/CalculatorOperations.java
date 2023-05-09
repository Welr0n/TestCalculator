import java.util.HashMap;
import java.util.Map;

public class CalculatorOperations {
    public static Calculator baseOperations() {
        Map<Character, OperationPerformer> mapOperations = new HashMap<>();
        mapOperations.put('+', new Addition());
        mapOperations.put('-', new Subtraction());
        mapOperations.put('/', new Division());
        mapOperations.put('*', new Multiplication());
        mapOperations.put('%', new RemainderOfDivision());
        return new Calculator(mapOperations);
    }
}
