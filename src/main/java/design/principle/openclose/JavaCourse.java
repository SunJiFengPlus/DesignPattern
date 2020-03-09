package design.principle.openclose;

public class JavaCourse implements Course {

    private Integer id;
    private String name;
    private Double price;
    
    public JavaCourse() {
        super();
    }
    @Override
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public JavaCourse(Integer id, String name, Double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "JavaCourse [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
