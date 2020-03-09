package design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse() {
        super();
    }

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "JavaDiscountCourse [getPrice()=" + getPrice() + ", getOriginPrice()=" + getOriginPrice() + ", getId()="
                + getId() + ", getName()=" + getName() + "]";
    }
}
