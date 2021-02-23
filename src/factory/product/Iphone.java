package factory.product;

/**
 * 苹果手机
 */
public class Iphone implements Phone {
    @Override
    public void use() {
        System.err.println("apple");
    }
}
