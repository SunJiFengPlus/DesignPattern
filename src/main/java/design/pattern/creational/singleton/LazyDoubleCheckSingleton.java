package design.pattern.creational.singleton;

/**
 *  减少了  synchronized 的开销, 也达到了安全要求
 */
public class LazyDoubleCheckSingleton {
    /**
     *  lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
     *  创建对象步骤: 1.分配内存 2.初始化对象 3.将 lazyDoubleCheckSingleton 指向内存地址
     *  由于重排序, 执行顺序变为了 132, 使用  volatile 关键字禁止重排序
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}