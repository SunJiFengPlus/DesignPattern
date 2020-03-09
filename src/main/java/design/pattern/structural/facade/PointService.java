package design.pattern.structural.facade;

/**
 * 积分相关业务
 * @author 孙继峰
 * @date 2019/04/05
 */
public class PointService {
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    public void exchangeGift(Gift gift) {
        // 资格校验
        qualifyService.isAvailable(gift);
        // 扣除积分
        pointPaymentService.pay(gift);
        // 物流发货
        shippingService.send(gift);
    }
}
