package ie.tudublin;

import java.util.ArrayList;

//Make a class called Word that has fields for the word (a String) and an ArrayList of type Follow as fields. Make accessor methods, 
//a constructor and a toString Method that will iterate through the follows ArrayList. (See the printout of the model above).

public class Word {
    String name;

    ArrayList<Follow> follow = new ArrayList<Follow>();
    
   
    public Word(String name, ArrayList<Follow> follow) {
         this.name = name;
         this.follow = follow;
    }

    @Override
    public String toString() {
        return "Word [follow=" + follow + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public ArrayList<Follow> getFollow() {
        return follow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFollow(ArrayList<Follow> follow) {
        this.follow = follow;
    }

    public Object getWord() {
        return null;
    }


    





    
}

     