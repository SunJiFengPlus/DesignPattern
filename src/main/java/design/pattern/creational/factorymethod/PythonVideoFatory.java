package design.pattern.creational.factorymethod;

public class PythonVideoFatory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
