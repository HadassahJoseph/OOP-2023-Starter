package ie.tudublin;

//Make a class called Follow that has fields for the word (a String) and the count (an int). Make accessor methods and constructors and a toString()

public class Follow {

    String name ;
    int Count;


    public Follow(String name, int Count) {
        this.name = name;
        this.Count = Count;
    }

    @Override
    public String toString() {
        return "Follow [Count=" + Count + ", name=" + name + "]";
    }
    
    public String getName() {
        return name;
    }

    public int getCount() {
        return Count;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCount(int count) {
        Count = count;
    }

    public Object getWord() {
        return null;
    }







    
}
