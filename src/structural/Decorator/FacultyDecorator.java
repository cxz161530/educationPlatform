package structural.Decorator;

public abstract class FacultyDecorator extends Faculty{
    Faculty faculty;
    public abstract String getDescription();
}

class graduateAdvisorDecorator extends FacultyDecorator{
    public graduateAdvisorDecorator(Faculty faculty){
        this.faculty = faculty;
    }
    public String getDescription(){
        return "graduated Advisor @" +new java.util.Date() + "->" +this.faculty;
    }

}


class underGraduateAdvisorDecorator extends FacultyDecorator{
    public underGraduateAdvisorDecorator(Faculty faculty){
        this.faculty = faculty;
    }
    public String getDescription(){
        return "undergraduate Advisor @" +new java.util.Date() + "->" +this.faculty;
    }

}

class class1Decorator extends FacultyDecorator{
    public class1Decorator(Faculty faculty){
        this.faculty = faculty;
    }
    public String getDescription(){
        return "class 1 @" +new java.util.Date() + "->" +this.faculty;
    }

}

class class2Decorator extends FacultyDecorator{
    public class2Decorator(Faculty faculty){
        this.faculty = faculty;
    }
    public String getDescription(){
        return "class 2 @" +new java.util.Date() + "->" +this.faculty;
    }

}

class class3Decorator extends FacultyDecorator{
    public class3Decorator(Faculty faculty){
        this.faculty = faculty;
    }
    public String getDescription(){
        return "class 3@" +new java.util.Date() + "->" +this.faculty;
    }

}

