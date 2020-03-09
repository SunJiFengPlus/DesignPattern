package design.pattern.creational.singleton;

/**
 * 枚举的单例模式可以防止反射攻击与序列化攻击
 *
 * @author 孙继峰
 * @date 2019/04/03
 */
public enum EnumSingleton {
    // 实例
    INSTANCE;

    private Object data = new Object();

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Object object1 = EnumSingleton.getInstance().getData();
        Object object2 = EnumSingleton.getInstance().getData();
        System.out.println(object1);
        System.out.println(object2);
    }
}
