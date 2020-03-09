package design.pattern.creational.builder;

/*
 *  建造者/生成器/构建器模式:
 *      将一个复杂对象的构建与他的表示分离, 使得同样的构建过程可以创建不同的表示
 *      用户只需指定建造的类型就可以得到他们, 建造细节过程不需要知道
 *  
 *  使用场景:
 *      一个对象有复杂的内部结构/很多属性、嵌套
 *      想把复杂对象的创建与使用分离
 *      
 *  缺点:
 *      产生多余的 Builder 对象
 *      产品发生变化, Builder 也要修改
 *      
 *  异同:
 *      建造者模式更注重方法的调用顺序, 工厂模式注重创建产品
 *      建造者模式知道对象的属性组成并创建对象, 工厂模式只要把对象创建出来
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().setArticle("java手机").setName("javaDesignPatter")
                .setPPT("javaPPT").setQA("javaQuestion").setVideo("javaVideo").build();
        System.out.println(course);
    }
}
