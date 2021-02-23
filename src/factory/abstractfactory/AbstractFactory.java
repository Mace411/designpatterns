package factory.abstractfactory;

import factory.product.Phone;

/**
 * 抽象工厂模式
 * 定义: 和工厂方法模式一样
 * 解决了工厂方法模式一个工厂只能生产一种产品的问题。
 */
public abstract class AbstractFactory {

    public abstract Phone createMiPhone();

    public abstract Phone createHuaweiPhone();

    public abstract Phone createIphone();
}
