package factory.product;

/**
 * 小米手机
 */
public class MiPhone implements Phone {
    @Override
    public void use() {
        System.err.println("xiaomi");
    }
}
