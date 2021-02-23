package singleton;

/**
 * 单例模式
 * 最常应用的模式，没有之一，面试也最爱问这个
 * 定义：一个类只有一个实例，而且实例由该类自己去创建
 * 构造方法是私有的
 * <p>
 * 下面内容是百度抄的
 * 需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少 GC。
 * 某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
 * 某些类创建实例时占用资源较多，或实例化耗时较长，且经常使用。
 * 某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
 * 频繁访问数据库或文件的对象。
 * 对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统会完全乱套。
 * 当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
 * <p>
 * 可分为：饿汉式，懒汉式，线程安全的懒汉式
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    /**
     * 饿汉式,这里instance应该定义为final static，在类加载的时候就初始化了
     * @return
     */
    public static Singleton getInstanceHungry() {
        return instance;
    }

    /**
     * 懒汉式
     * @return
     */
    public static Singleton getInstanceLazy() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 线程安全的懒汉式
     * @return
     */
    public static Singleton getInstanceLazyThreadSave() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton.class) {
            //这里使用了双重校验
            if (instance != null) {
                return instance;
            }
            instance = new Singleton();
        }
        return instance;
    }
}
