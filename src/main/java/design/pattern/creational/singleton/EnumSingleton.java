package design.pattern.creational.singleton;

/**
 * 枚举的单例模式可以防止反射攻击与序列化攻击
 *
 * @author 孙继峰
 * @date 2019/04/03
 */
public enum EnumSingleton {
    INSTANCE;
    public void method() {

    }
}
