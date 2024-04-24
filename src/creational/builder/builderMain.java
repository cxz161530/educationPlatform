package creational.builder;

public class builderMain {
    public static void main(String[] args){
        Director director = new Director();
        Builder builder;
        UICourse course;

        System.out.println("\n--Testing OOP version of UI");
        builder = new OOPJavaBuilder();
        course = director.createUI(builder);
        course.showCourse();

        System.out.println("\n--Testing BasicSQL version of UI");
        builder = new BasicSQLBuilder();
        course = director.createUI(builder);
        course.showCourse();

        System.out.println("\n--Testing Database Management version of UI");
        builder = new DatabaseManagementBuilder();
        course = director.createUI(builder);
        course.showCourse();

        System.out.println("\n--Testing Advanced Java version of UI");
        builder = new AdvancedJavaBuilder();
        course = director.createUI(builder);
        course.showCourse();



    }
}
