package design.pattern.creational.factorymethod;

public class JavaVideoFatory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
