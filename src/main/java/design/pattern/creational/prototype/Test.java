package design.pattern.creational.prototype;

/**
 * 原型模式适用: 类初始化消耗过多资源
 *              new 出的对象需要非常繁琐的过程
 *              构造函数比较复杂
 *              循环体中生成大量的对象时
 *
 * 优点: 性能比直接 new 一个对象高
 *
 *
 *
 * @author 孙继峰
 * @date 2019/04/04
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail temp = (Mail) mail.clone();
            mail.setName("同学" + i);
            mail.setAddress("同学" + i + "@outlook.com");
            mail.setContent("尊敬的同学" + i + "你好");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveRecord(mail);
    }
}
