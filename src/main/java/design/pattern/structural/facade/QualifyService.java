package design.pattern.structural.facade;

/**
 * 验证业务
 * @author 孙继峰
 * @date 2019/04/05
 */
public class QualifyService {
    public boolean isAvailable(Gift gift) {
        // 验证业务
        System.out.println("校验结果: 用户积分足够, 库存足够");
        return true;
    }
}
