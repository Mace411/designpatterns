package strategy;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 * 定义一系列的算法类，每个算法类封装一种算法，并让他们可以自由地转换
 * 主要目的是把算法的定义和算法的使用分开，把算法放在对应的策略类中，把算法的使用放在环境类中。
 * 关键是理解抽象策略类，具体策略类和环境类。
 * 优点：开闭原则
 * 将算法的定义和使用分开，使算法的使用和算法本身不会混在一块(单一职责原则)，
 * 可以避免多重条件语句
 * 缺点：调用者需要知道全部的策略，自定决定使用哪种策略
 * 每定义一个策略就需要新增一个新的策略类，增加了复杂度
 * 应用场景：不需要知道算法的具体实现，调用相应的策略就可以得到结果
 *
 * 和模板方法的区别：
 * 看起来策略模式和模板方法很像，但其实也是有区别的
 * 策略模式注重的是把每个算法封装成一个策略类，通过环境类来使用算法，也就是把算法的定义和算法的使用分离
 * 而模板方法是一个固定模板，只需要修改其中部分代码来实现不同的行为，可以提高代码的复用性
 *
 */
public class Strategy {

    private static Map<Calculation, ICalculationStrategy> strategyMap;

    static {
        strategyMap = new HashMap<>();
        for (Calculation value : Calculation.values()) {
            ICalculationStrategy strategy = null;
            try {
                strategy = value.strategyClass.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            strategyMap.put(value, strategy);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = Calculator.calculator;
        //模拟客户端
        //加法
        ICalculationStrategy plus = strategyMap.get(Calculation.PLUS);
        calculator.setStrategy(plus);
        System.err.println(calculator.calculate(1, 2));
        //减法
        ICalculationStrategy minus = strategyMap.get(Calculation.MINUS);
        calculator.setStrategy(minus);
        System.err.println(calculator.calculate(3, 2));
        //乘法
        ICalculationStrategy multiply = strategyMap.get(Calculation.MULTIPLY);
        calculator.setStrategy(multiply);
        System.err.println(calculator.calculate(3, 2));
        //除法
        ICalculationStrategy divide = strategyMap.get(Calculation.DIVIDE);
        calculator.setStrategy(divide);
        System.err.println(calculator.calculate(6, 2));
    }

}
