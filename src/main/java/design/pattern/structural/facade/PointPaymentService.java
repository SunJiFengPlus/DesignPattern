package design.pattern.structural.facade;

/**
 * 积分支付业务
 * @author 孙继峰
 * @date 2019/04/05
 */
public class PointPaymentService {
    public void pay(Gift gift){
        // 扣除积分
        System.out.println("支付成功");
        return;
    }

}
