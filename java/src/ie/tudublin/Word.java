package ie.tudublin;

import java.util.ArrayList;

public class Word {
    String name;

    ArrayList<Follow> follow = new ArrayList<Follow>();
   
    public Word(String name, ArrayList<Follow> follow) {
         this.name = name;
         this.follow = follow;
    }
    
}
