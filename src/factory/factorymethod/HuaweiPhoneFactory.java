package factory.factorymethod;

import factory.product.HuaweiPhone;
import factory.product.Phone;

/**
 * 华为手机生产工厂
 */
public class HuaweiPhoneFactory implements IFactoryMethod {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
