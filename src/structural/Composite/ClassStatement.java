package structural.Composite;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class ClassStatement {
    public void add(ClassStatement statement){throw new UnsupportedOperationException();}
    public void remove(ClassStatement menuComponent){throw new UnsupportedOperationException();}
    public abstract void printStatement();

}

class SemesterStatement extends ClassStatement{
    private String half;
    private int year;

    public SemesterStatement(String half, int year){
        this.half = half;
        this.year = year;
    }

    public void printStatement(){
        System.out.println("** Semester Statement for " +
                this.half+
                this.year);
    }

}

class ComboStatement extends ClassStatement {
    private String description;
    private List<ClassStatement> statements;
    public ComboStatement(String description){
        this.description = description;
        this.statements = new ArrayList<>();
    }

    public void add(ClassStatement statement){
        this.statements.add(statement);
    }

    public void remove(ClassStatement statement){
        this.statements.remove(statement);
    }

    public void printStatement(){
        System.out.println( "\n** Combo Statement of" +
                this.description);
        for (ClassStatement s: statements){
            s.printStatement();;

        }
    }
}
