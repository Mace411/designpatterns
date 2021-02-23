package factory;

import factory.abstractfactory.ConcreteFactory;
import factory.factorymethod.HuaweiPhoneFactory;
import factory.product.Phone;
import factory.staticfactory.SimpleFactory;

/**
 * 工厂模式测试
 */
public class Factory {
    /**
     * 简单工厂
     *
     * @param type
     */
    public static void testSimpleFactory(int type) {
        Phone phone = SimpleFactory.createPhone(type);
        phone.use();
    }

    /**
     * 工厂方法
     */
    public static void testFactoryMethod() {
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        Phone huaweiPhone = huaweiPhoneFactory.createPhone();
        huaweiPhone.use();
    }

    /**
     * 抽象工厂
     */
    public static void testAbstractFactory() {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Phone miPhone = concreteFactory.createMiPhone();
        miPhone.use();
    }

    public static void main(String[] args) {
        testSimpleFactory(2);
        testFactoryMethod();
        testAbstractFactory();
    }

}
