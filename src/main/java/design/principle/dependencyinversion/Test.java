package design.principle.dependencyinversion;

/*
 *  思想: 1. 高层模块不应该依赖于底层模块, 二者都应该依赖于抽象 
 *       2. 抽象不应该依赖细节, 细节应依赖于抽象
 *       3. 针对接口编程, 不针对实现编程
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // v1
//        Person person = new Person();
//        person.studyJava();
//        person.studyJs();

        // v2 √
//        Person person = new Person();
//        person.study(new JavaCourse());
//        person.study(new JsCourse());
        
        // v3 不可赋值
        Person person = new Person(new JavaCourse());
        person.study();
        
        // v4 √
//        Person person = new Person();
//        person.setCourse(new JavaCourse());
//        person.study();
//        person.setCourse(new JsCourse());
//        person.study();
    }
}