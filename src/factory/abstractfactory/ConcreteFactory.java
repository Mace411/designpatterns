package factory.abstractfactory;

import factory.product.HuaweiPhone;
import factory.product.Iphone;
import factory.product.MiPhone;
import factory.product.Phone;

/**
 * 可以生产多种产品的工厂
 */
public class ConcreteFactory extends AbstractFactory{
    @Override
    public Phone createMiPhone() {
        return new MiPhone();
    }

    @Override
    public Phone createHuaweiPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Phone createIphone() {
        return new Iphone();
    }
}
