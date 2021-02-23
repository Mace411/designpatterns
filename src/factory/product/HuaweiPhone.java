package factory.product;

/**
 * 华为手机
 */
public class HuaweiPhone implements Phone {
    @Override
    public void use() {
        System.err.println("huawei");
    }
}
