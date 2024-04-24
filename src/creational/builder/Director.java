package creational.builder;

public class Director {
    private Builder builder;
    public UICourse createUI(Builder builder){
        this.builder = builder;
        builder.createDescription();
        builder.createSyllabus();
        builder.format();
        return builder.getUI();
    }
}
