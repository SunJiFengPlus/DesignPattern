package design.pattern.structural.facade;

/**
 * 物流业务
 * @author 孙继峰
 * @date 2019/04/05
 */
public class ShippingService {
    public void send(Gift gift) {
        // 物流发货
        System.out.println("已发货");
    }
}
