package design.pattern.creational.factorymethod;

/*
 *  定义一个创建对象的接口, 但让实现接口的类来决定实例化哪个类
 *  工厂方法让类的实例化推迟到子类中进行
 *  
 *  使用场景:
 *      创建对象需要大量重复的代码
 *      客户端/应用层不依赖于产品类实例如何被创建 实现等细节
 *      一个类通过其子类来指定创建哪个对象
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFatory();
        System.out.println(factory.getVideo());
    }
}
