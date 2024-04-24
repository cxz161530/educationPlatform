package creational.abstractFactory;

public class factoryMain {
    public static void main(String[] args) {
        UndergraduateProgramFactory factory;

        System.out.println("--Testing basic version of undergraduate Program");
        factory = new UndergraduateProgramFactory();
        testUndergraduateCreation(factory);

        System.out.println("\n Testing cs version of undergraduate program ");
        factory = new CSUndergraduatgeProgramFactory();
        testUndergraduateCreation(factory);



        System.out.println("\n Testing CIS version of undergraduate program ");
        factory = new CISUndergraduatgeProgramFactory();
        testUndergraduateCreation(factory);
    }
    public static void testUndergraduateCreation(UndergraduateProgramFactory undergraduateProgramFactory){

        System.out.println("Creating Core Courses");
        CoreCourses undergraduate1 = undergraduateProgramFactory.createCoreCourses();
        System.out.println(undergraduate1);

        System.out.println("Creating Elective Courses");
        ElectiveCourses undergraduate2 = undergraduateProgramFactory.createElectiveCourses();
        System.out.println(undergraduate2);


    };


}