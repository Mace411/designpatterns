package templatemethod;

/**
 * 蒜蓉生菜
 */
public class CookShengCai extends Cook{
    @Override
    FoodType getType() {
        return FoodType.SUAN_RONG_SHENG_CAI;
    }

    @Override
    public void putFood() {
        System.err.println("下生菜");
    }

    @Override
    public void putCondiment() {
        System.err.println("下蒜蓉");
    }
}
