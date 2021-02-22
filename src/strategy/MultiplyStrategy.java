package strategy;

/**
 * 乘法策略
 */
public class MultiplyStrategy implements ICalculationStrategy {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
