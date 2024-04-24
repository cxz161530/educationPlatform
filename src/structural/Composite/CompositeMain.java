package structural.Composite;

import java.time.Month;

public class CompositeMain {
    public static void main(String[] args){
        System.out.println("\n Showing Semester Statement by itself");
        ClassStatement s1 = new SemesterStatement("Spring", 2024);
        s1.printStatement();

        System.out.println("\n Showing 2024 Yearly Statement");
        ClassStatement q1 = new ComboStatement(" 2024 Yearly Statement");
        q1.add(new SemesterStatement("Spring ", 2024));
        q1.add(new SemesterStatement("Fall ", 2024));
        q1.printStatement();

        System.out.println("\n Showing 2023 Yearly Statement ");
        ClassStatement q2 = new ComboStatement(" 2023 Yearly Statement");
        q2.add(new SemesterStatement("Spring ", 2023));
        q2.add(new SemesterStatement("Fall ", 2023));

        q2.printStatement();

        ClassStatement h1 = new ComboStatement(" 2023 and 2024 combo years statement");
        h1.add(q1);
        h1.add(q2);
        h1.printStatement();


    }
}
