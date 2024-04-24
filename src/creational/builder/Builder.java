package creational.builder;

public abstract class Builder {
    private UICourse course;
    public Builder(){
        course = new UICourse();
    }

    public abstract void createDescription();
    public abstract void createSyllabus();
    public abstract void format();

    public UICourse getUI(){
        return course;
    }
   public void addStep(String step){course.addStep(step);}
}

class OOPJavaBuilder extends Builder{
    public void createDescription(){
        addStep("Creating OOP JAVA Description");
    }
    public void createSyllabus(){
        addStep("Creating OOP JAVA Syllabus");
    }
    public void format(){
        addStep("returning OOP JAVA format HTML");
    }
}

class AdvancedJavaBuilder extends Builder{
    public void createDescription(){
        addStep("Creating Advanced Java Description");
    }
    public void createSyllabus(){
        addStep("Creating Advanced Java Syllabus");
    }
    public void format(){
        addStep("returning Advanced Java format HTML");
    }
}

class DatabaseManagementBuilder extends Builder{
    public void createDescription(){
        addStep("Creating Database Management Description");
    }
    public void createSyllabus(){
        addStep("Creating Database Management Syllabus");
    }
    public void format(){
        addStep("returning Database Management format HTML");
    }
}
class BasicSQLBuilder extends Builder{
    public void createDescription(){
        addStep("Creating Basic SQL Description");
    }
    public void createSyllabus(){
        addStep("Creating Basic SQL Syllabus");
    }
    public void format(){
        addStep("returning Basic SQL format HTML");
    }
}
