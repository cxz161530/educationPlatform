package creational.abstractFactory;

public class UndergraduateProgramFactory {
    public CoreCourses createCoreCourses(){
        return new CoreCourses();
    }
    public ElectiveCourses createElectiveCourses(){
        return new ElectiveCourses();
    }
}

class CSUndergraduatgeProgramFactory extends UndergraduateProgramFactory{
    public CoreCourses createCoreCourses(){
        return new CSCoreCourses();
    };
    public ElectiveCourses createElectiveCourses(){
        return new CSElectiveCourses();
    };

}

class CISUndergraduatgeProgramFactory extends UndergraduateProgramFactory{
    public CoreCourses createCoreCourses(){
        return new CISCoreCourses();
    };
    public ElectiveCourses createElectiveCourses(){
        return new CISElectiveCourses();
    };

}


