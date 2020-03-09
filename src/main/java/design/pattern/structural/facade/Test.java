package design.pattern.structural.facade;

/**
 * 门面模式/外观模式
 *
 * 栗子: 一个 Controller 里注入多个 Service, 一个 Service 里注入多个 DAO
 *
 * @author 孙继峰
 * @date 2019/04/05
 */
public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift("佩奇全集");
        PointService service = new PointService();
        service.exchangeGift(gift);

    }
}
