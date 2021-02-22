package strategy;

/**
 * 除法策略
 */
public class DivideStrategy implements ICalculationStrategy {

    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
