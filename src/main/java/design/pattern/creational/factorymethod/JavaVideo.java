package design.pattern.creational.factorymethod;

public class JavaVideo extends Video {

    @Override
    void createVideo() {
        System.out.println("createJavaVideo");
    }
}
