package design.pattern.creational.singleton;

/*
 *  保证一个类只有一个实例, 并提供一个全局访问点
 *  适用:
 *      确保任何情况下都绝对只有一个实例
 *  特点:
 *      在内存中只有一个实例, 减少了内存的开销, 特别是需要频繁创建销毁的对象      
 *      避免对资源的多重占用, 避免对文件的同时写操作
 *  例如: 
 *      单服务器下网站计数器, 线程池, 数据库连接池
 */
public class Test {
    
    // JUnit 测试类不能直接 debug, 需要 CountDownLatch 辅助
    public static void main(String[] args) {
        testLazyDoubleCheckSingleton();
    }
    
    public static void testLazySingleton() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
            }, String.valueOf(i)).start();
        }
    }
    
    public static void testLazyDoubleCheckSingleton() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
            }, String.valueOf(i)).start();
        }
    }
    
    /*
     *  使用 ObjectOutputStream 与 ObjectInputStream 序列化反序列化时, 反序列化之后与序列化之前的对象地址不同了
     *  解决方法: 在序列化的对象中加上 Object readResolve() {return 单例模式维护的对象} 
     */
    public static void testSerializableSingleton() {
        
    }
}
