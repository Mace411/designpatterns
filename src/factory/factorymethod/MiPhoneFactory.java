package factory.factorymethod;

import factory.product.MiPhone;
import factory.product.Phone;

/**
 * 小米手机生产工厂
 */
public class MiPhoneFactory implements IFactoryMethod {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
