package strategy;

/**
 * 环境类
 * 计算器
 */
public class Calculator {

    public static final Calculator calculator;

    static {
        calculator = new Calculator();
    }

    private ICalculationStrategy strategy;

    public void setStrategy(ICalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
