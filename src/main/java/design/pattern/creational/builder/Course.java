package design.pattern.creational.builder;

//import lombok.Data;

//@Data
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String article;
    private String qa;

    public Course (CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.ppt = courseBuilder.ppt;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.qa = courseBuilder.qa;
    }
    
    public static class CourseBuilder {
        private String name;
        private String ppt;
        private String video;
        private String article;
        private String qa;
        
        public Course build() {
            return new Course(this);
        }

        // 返回值为 CourseBuilder, 链式调用
        public CourseBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder setPPT(String ppt) {
            this.ppt = ppt;
            return this;
        }

        public CourseBuilder setVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder setArticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder setQA(String qa) {
            this.qa = qa;
            return this;
        }

    }
}
