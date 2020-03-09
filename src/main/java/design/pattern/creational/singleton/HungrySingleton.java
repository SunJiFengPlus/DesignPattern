package design.pattern.creational.singleton;

public class HungrySingleton {
    /**
     *  final 修饰的变量必须要在类加载完成时完成初始化
     */
    private final static HungrySingleton hungrySingleton;
    
    static {
        hungrySingleton = new HungrySingleton();
    }

    /**
     * 可以通过 Class 对象得到 Constructor, 设置私有可访问后, 可以得到新实例
     * 所以需要防止反射得到单例实例
     */
    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例不允许反射创建");
        }
    }
    
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}