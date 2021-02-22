package templatemethod;

/**
 * 干锅花菜
 */
public class CookHuaCai extends Cook{
    @Override
    FoodType getType() {
        return FoodType.GAN_GUO_HUA_CAI;
    }

    @Override
    public void putFood() {
        System.err.println("下花菜");
    }

    @Override
    public void putCondiment() {
        System.err.println("下辣椒");
    }
}
