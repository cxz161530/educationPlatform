package creational.abstractFactory;

public abstract class UndergraduateProgram {
}

class CoreCourses extends UndergraduateProgram {
    public String toString(){
        return"**Basic  Undergraduate Core Courses**";
    }
}

class CSCoreCourses extends CoreCourses{
    public String toString(){
        return super.toString()+ "::" + "undergraduate CS Core Courses";
    }
}

class CISCoreCourses extends CoreCourses{
    public String toString(){
        return super.toString()+ "::" + "undergraduate CIS Core Courses";
    }
}

class ElectiveCourses extends UndergraduateProgram{
    public String toString(){
        return"**Basic Undergraduate Elective Courses**";
    }
}

class CSElectiveCourses extends ElectiveCourses{
    public String toString(){
        return super.toString()+ "::" + "undergraduate CS Elective Courses";
    }
}

class CISElectiveCourses extends ElectiveCourses{
    public String toString(){
        return super.toString()+ "::" + "undergraduate CIS Elective Courses";
    }
}

