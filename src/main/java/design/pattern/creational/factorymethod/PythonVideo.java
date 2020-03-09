package design.pattern.creational.factorymethod;

public class PythonVideo extends Video {

    @Override
    void createVideo() {
        System.out.println("createPythonVideo");
    }

}
