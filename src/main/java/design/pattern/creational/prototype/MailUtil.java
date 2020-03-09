package design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author 孙继峰
 * @date 2019/04/04
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String content = "向{0}, 地址{1}, 内容{2}, 发生邮件成功";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getAddress(), mail.getContent()));
    }

    public static void saveRecord(Mail mail) {
        System.out.println("save: " + mail.toString());
    }

}
