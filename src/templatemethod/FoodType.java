package templatemethod;

/**
 * 菜的类型
 */
public enum FoodType {
    /**
     * 蒜蓉生菜
     */
    SUAN_RONG_SHENG_CAI(CookShengCai.class),
    /**
     * 干锅花菜
     */
    GAN_GUO_HUA_CAI(CookHuaCai.class),
    ;

    Class<? extends Cook> cookClass;

    FoodType(Class<? extends Cook> cookClass) {
        this.cookClass = cookClass;
    }
}
