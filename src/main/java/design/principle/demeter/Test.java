package design.principle.demeter;

/*
 *  迪米特原则:
 *      一个对象对其他的对象保持最少的了解
 *      多使用 private protected 权限
 *      只与朋友交流, 不和陌生人交流, 朋友: 成员变量、方法的输入输出的类, 出现在方法体内部的类不属于朋友
 *      
 *  Boss 命令 Leader 去 count Course
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.commandCount(leader);
    }
}
