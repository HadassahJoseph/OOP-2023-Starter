package ie.tudublin;

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

    





    
}
