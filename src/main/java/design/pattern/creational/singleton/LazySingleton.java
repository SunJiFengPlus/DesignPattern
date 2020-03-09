package design.pattern.creational.singleton;

/**
 * 懒汉式单例模式: 初始时不创建, 使用时创建
 * 使用 synchronized 消耗性能, 不使用 synchronized 不安全
 */
public class LazySingleton {
    
    private static LazySingleton lazySingleton = null;
    
    private LazySingleton() {}
    
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
