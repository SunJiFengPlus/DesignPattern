package design.principle.dependencyinversion;

public class JavaCourse implements Course {

    @Override
    public void studyCourse() {
        System.out.println("学习java");
    }
}
