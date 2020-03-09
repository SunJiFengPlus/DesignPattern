package design.principle.demeter;

public class Leader {
    
    public Integer countCourse() {
        return new Course().getList().size();
    }
}