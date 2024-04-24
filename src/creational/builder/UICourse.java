package creational.builder;

import java.util.ArrayList;

import java.util.List;

public class UICourse {
    private List<String>steps;
    public UICourse(){steps = new ArrayList<>();}
    public void addStep(String description){
        steps.add(description);
    }
    public void showCourse(){
        System.out.println("\n Course set up completed as below: ");
        for(int i=0; i<steps.size(); i++)
            System.out.printf("Part %2d: %s\n", i+1, steps.get(i));
    }

}
