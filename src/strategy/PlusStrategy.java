package strategy;

/**
 * 加法策略
 */
public class PlusStrategy implements ICalculationStrategy{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
