package structural.Decorator;

public abstract class Faculty {
    String description = "Basic Faculty";
    public String getDescription(){
        return description;
    }

}
class FullTimeFaculty extends Faculty{
    public FullTimeFaculty(){
        description= "Full Time Faculty";
    }

}

class PartTimeFaculty extends Faculty{
    public PartTimeFaculty(){
        description= "This is the Part time Faculty";
    }


}

