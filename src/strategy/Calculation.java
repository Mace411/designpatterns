package strategy;

/**
 * 运算类型
 */
public enum Calculation {
    /**
     * 加法
     */
    PLUS(PlusStrategy.class),
    /**
     * 减法
     */
    MINUS(MinusStrategy.class),
    /**
     * 乘法
     */
    MULTIPLY(MultiplyStrategy.class),
    /**
     * 除法
     */
    DIVIDE(DivideStrategy.class),
    ;


    Class<? extends ICalculationStrategy> strategyClass;

    Calculation(Class<? extends ICalculationStrategy> strategyClass) {
        this.strategyClass = strategyClass;
    }
}
