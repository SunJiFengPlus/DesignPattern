package design.pattern.creational.prototype;

/**
 * @author 孙继峰
 * @date 2019/04/04
 */
public class Mail implements Cloneable {

    private String name;
    private String address;
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone");
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Mail() {

    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
