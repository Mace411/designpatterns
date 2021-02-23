package factory.staticfactory;

import factory.product.HuaweiPhone;
import factory.product.Iphone;
import factory.product.MiPhone;
import factory.product.Phone;

/**
 * 简单工厂模式(静态方法模式)
 * 定义：通过一个静态方法创建对象，只需要知道方法的参数即可，不需要知道对象的构造过程
 * 优点:
 * 产品和工厂分离，各施其职
 * 调用者只需要知道参数即可，不需要知道生产过程
 * 缺点:
 * 每添加一个产品就要新增一个产品类，修改工厂的逻辑
 * 使用了static方法，不方便工厂的扩展
 */
public class SimpleFactory {

    private final static int HUAWEI = 1;
    private final static int IPHONE = 2;
    private final static int XIAOMI = 3;

    public static Phone createPhone(int type) {
        switch (type) {
            case HUAWEI:
                return new HuaweiPhone();
            case IPHONE:
                return new Iphone();
            case XIAOMI:
                return new MiPhone();
            default:
                return null;
        }
    }

}
