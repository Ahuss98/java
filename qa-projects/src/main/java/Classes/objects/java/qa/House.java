package Classes.objects.java.qa;



public class House {

    //these are instance FIELDS (because every house we create will have its own copy)
    private int numStories;
    private int numWindows;
    private String colour;

    //customary to put cinstructor at the top

    //no-arg constructor
    public House(){
        numStories = 1;
        numWindows = 4;
        colour = "grey";
    }

    //paramerterzid constuctor
    public House(int numStories, int numWindows, String colour){
        this.numStories = numStories;
        this.numWindows = numStories;
        this.colour = colour;
    }

    // these are instance methods ( these get called on an object)
    public int getNumStories(){
        return numStories;
    }

    //the name of the parameter is the same as the field I am reassigning we use the (this) keyword to point to the field inside the class
    //the reason we use the same name for both the field and parameter is that coming up with alot of names can get difficult so we use "name shadowing"
    public void setNumStories(int numStories){
        this.numStories = numStories;
    }
    public int getNumWindows(){
        return numWindows;
    }

    public void setNumWindows(int numWindows){
        this.numWindows = numWindows;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

}//end
