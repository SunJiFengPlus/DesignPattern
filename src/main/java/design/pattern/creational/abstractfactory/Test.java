package design.pattern.creational.abstractfactory;
/*
 *  提供一个创建一系列相关或相互依赖对象的接口, 无需指定具体的类
 * 
 *  使用场景:
 *      客户端/应用层不依赖于产品类实例如何被创建、实现等细节
 *      强调一系列相关的产品对象(同一产品族), 一族产品一起创建对象需要大量重复的代码
 *      提供一个产品的类库, 所有的产品以同样的接口出现, 从而使客户端不依赖于具体实现
 *  
 *  如果增加新的产品族容易修改, 如果增加新的产品等级就麻烦了, 工厂方法关注产品等级, 抽象工厂关注产品族
 *  
 *  同一产品等级: 美迪冰箱 海尔冰箱 格力冰箱
 *  同一产品族: 海尔洗衣机 海尔冰箱 海尔电视
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.getArticle().produce();
        factory.getVideo().produce();
    }
}
