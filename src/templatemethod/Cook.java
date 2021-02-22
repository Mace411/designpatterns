package templatemethod;

/**
 * 做菜的模板
 * 炒菜基本都是这些步骤，下的菜以及下的酱料不一样，可以由具体的子类去实现
 */
public abstract class Cook {

    /**
     * 具体是哪一种菜
     */
    abstract FoodType getType();

    final public void cookProcess() {
        //炒菜的模板步骤
        //1、下油
        putOil();
        //2、下菜
        putFood();
        //3、下调料
        putOil();
        //4、炒菜
        fry();
        //5、起锅
        dishUp();
    }

    public void putOil() {
        System.err.println("下油");
    }

    /**
     * 下的菜可以由子类具体实现
     */
    abstract void putFood();

    /**
     * 酱料可以由子类具体实现
     */
    abstract void putCondiment();

    public void fry() {
        System.err.println("炒菜");
    }

    public void dishUp() {
        System.err.println("起锅");
    }

}
