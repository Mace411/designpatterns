package factory.factorymethod;

import factory.product.Phone;

/**
 * 工厂方法模式
 * 定义：定义一个产品生产接口，具体的生产过程交由子类完成
 * 主要目的：解决简单工厂的在新增产品时需要修改原有代码的问题(开闭原则)
 *
 * 优点:
 *  不需要知道产品的生产过程
 *  新增产品时，新增产品类和工厂类即可
 * 缺点：
 *  工厂类太多，增加系统的复杂度
 *  每种工厂只能生产一种产品
 *
 * 平时用的比较多，项目里面也有到，物品的创建，搭配模板方法模式
 */
public interface IFactoryMethod {

    Phone createPhone();

}
