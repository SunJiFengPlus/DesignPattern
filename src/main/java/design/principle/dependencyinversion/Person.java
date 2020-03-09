package design.principle.dependencyinversion;

public class Person {

    // v1
//    public void studyJava() {
//        System.out.println("学习 java");
//    }
//    public void studyJs() {
//        System.out.println("学习 js");
//    }
    
    // v2
//    public void study(Course course) {
//        course.studyCourse();
//    }
    
    // v3
    Course course;
    
    public Person(Course course) {
        super();
        this.course = course;
    }
    
    public void study() {
        course.studyCourse();
    }
}
