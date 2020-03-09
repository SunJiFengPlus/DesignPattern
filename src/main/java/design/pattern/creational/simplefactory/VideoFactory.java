package design.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(Class<? extends Video> c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
