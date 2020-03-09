package design.principle.demeter;

public class Boss {
    public void commandCount(Leader leader) {
        System.out.println(leader.countCourse());
    }
}