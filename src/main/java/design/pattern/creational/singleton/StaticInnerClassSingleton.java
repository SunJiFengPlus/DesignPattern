package design.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    /**
     * JVM 在 Class 被加载后, 被线程调用之前, 这个阶段执行类的初始化
     * 执行期间 JVM 会获取一个锁, 这个锁会同步多个线程对一个类的初始化
     * 
     * 初始化一个类包括: 执行这个类的静态初始化, 初始化在这个类中声明的静态变量
     * 
     * 类被初始化的条件:
     *      1. 有一个该类的实例被创建
     *      2. 该类中声明的静态方法被调用
     *      3. 该类中声明的静态成员被赋值
     *      4. 该类中声明的静态成员被使用, 且该成员不是常量
     *      5. 有嵌套的断言语句 (不常用)
     *
     * 这种单例模式核心在 InnerClass 类的对象的初始化锁被哪个线程拿到并初始化
     */
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton == null) {
            throw new RuntimeException("单例不允许反射创建");
        }
    }
    
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
