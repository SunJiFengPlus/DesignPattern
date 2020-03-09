package design.principle.dependencyinversion;

public class HtmlCourse implements Course {

    @Override
    public void studyCourse() {
        System.out.println("学习html");
    }
}
