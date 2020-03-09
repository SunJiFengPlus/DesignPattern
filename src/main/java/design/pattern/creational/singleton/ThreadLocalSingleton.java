package design.pattern.creational.singleton;

/**
 * ThreadLocal 的单例模式可以使每一个线程拿到的对象都使一样的
 * 不同线程拿到的对象是不一样的
 *
 * @author 孙继峰
 * @date 2019/04/04
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> singleton = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return singleton.get();
    }

}
