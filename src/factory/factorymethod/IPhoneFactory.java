package factory.factorymethod;

import factory.product.Iphone;
import factory.product.Phone;

/**
 * 苹果手机生产工厂
 */
public class IPhoneFactory implements IFactoryMethod {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
