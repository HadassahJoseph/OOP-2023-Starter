package ie.tudublin;

import java.util.ArrayList;

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


    





    
}

     