package structural.Decorator;

import structural.Decorator.Faculty;

public class StructureMain {
    public static void main(String[] args){
        Faculty fullTimeFaculty = new FullTimeFaculty();
        Faculty normalFullTimeFaculty = new class2Decorator(class1Decorator(fullTimeFaculty));
        Faculty chairPerson = new FullTimeFaculty();
        Faculty graAdvisor = new FullTimeFaculty();
        Faculty undGraAdvisor = new FullTimeFaculty();

        Faculty partTimeFaculty = new PartTimeFaculty();
        System.out.println("Testing normal full time faculty");
        System.out.println(normalFullTimeFaculty.getDescription());

        System.out.println("Testing normal chair person");
        System.out.println(chairPerson.getDescription());


    }

}
