public class Subtraction implements OperationPerformer {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    @Override
    public char getOperator() {
        return '-';
    }
}
