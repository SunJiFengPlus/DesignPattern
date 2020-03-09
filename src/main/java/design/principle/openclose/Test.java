package design.principle.openclose;

/*
 *  现有 Course, JavaCourse 类, 新需求打折: 显示原价与折后价
 *  解决: 定义 JavaDiscountCourse 继承 JavaCourse
 *  思想: 对  Course, JavaCourse 修改是关闭, 对 Course, JavaCourse 扩展是开发的
 */
public class Test {
    public static void main(String[] args) {
        Course javaCourse = new JavaDiscountCourse(96, "java从零", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println(javaDiscountCourse.getId());
        System.out.println(javaDiscountCourse.getName());
        System.out.println(javaDiscountCourse.getOriginPrice());
        System.out.println(javaDiscountCourse.getPrice());
    }
}