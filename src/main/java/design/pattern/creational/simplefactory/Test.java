package design.pattern.creational.simplefactory;

/*
 *  简单工厂模式:
 *      工厂类负责创建的对象比较少
 *      调用方只指导工厂类传入的参数, 对于如何创建对象不关心
 *      
 *  不属于 23 种设计模式
 *  
 *  简单工厂模式应用: java.util.Calendar#getInstance(), java.sql.DriverManager#getConnection(String)
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        System.out.println(video);
    }
}