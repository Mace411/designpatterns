package strategy;

/**
 * 减法策略
 */
public class MinusStrategy implements ICalculationStrategy{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
