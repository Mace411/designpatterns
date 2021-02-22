package templatemethod;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * 模板方法模式。
 * 定义一个模板结构，把具体的实现延迟到子类中去实现，基于继承的设计模式
 * 主要作用：不改变模板结构，通过修改子类中的内容达到不同的行为，提高代码的复用性(相同的代码抽到父类中，不同的在子类中实现)
 * 符合开闭原则(开:扩展是开放的，闭:修改是封闭的)，行为是可以通过子类来扩展，但是原模板是封闭的不能修改
 * 缺点：每扩展一个行为就要新增一个子类，增加了系统的复杂度
 * 应用场景: 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现；
 * 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复；
 * 控制子类的扩展。
 */
public class TemplateMethod {
    private static Map<FoodType, Cook> foodTypeCookMap;

    static {
        foodTypeCookMap = new HashMap<>();
        for (FoodType value : FoodType.values()) {
            Cook cook = null;
            try {
//              cook = value.cookClass.newInstance();这个方法在java9被弃用，推荐使用下面的，明确调用的是哪个构造方法，没有参数就调用默认无参的
//              cook = value.cookClass.getDeclaredConstructor(int.class).newInstance(1);
                cook = value.cookClass.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            foodTypeCookMap.put(value, cook);
        }
    }

    public static void cook(FoodType foodType) {
        Cook cook = foodTypeCookMap.get(foodType);
        Optional.of(cook).ifPresentOrElse(Cook::cookProcess, () -> System.err.println("您要的菜暂时还没上架"));
    }

    public static void main(String[] args) {
        //模拟客人点菜下单过来
        List<FoodType> order = new ArrayList<>();
        order.add(FoodType.GAN_GUO_HUA_CAI);
        order.add(FoodType.SUAN_RONG_SHENG_CAI);
        for (FoodType foodType : order) {
            cook(foodType);
        }
    }

}
