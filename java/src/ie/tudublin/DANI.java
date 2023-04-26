package ie.tudublin;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class DANI extends PApplet {

	
	void loadFile(String w, String s)
	{
		String[] string = loadStrings("java/data/small.txt");	
		String line;
		for ( String follow : split(line, ' '))
		{
			follow.replaceAll("[^\\w\\s]","");
			follow.toLowerCase();

		}
		/*{
			w.replaceAll("[^\\w\\s]","");
			s.toLowerCase();
		}*/	
	}


	void findWord ()
	{
		ArrayList<Word> word;
		for (Word w : word)
		{
			if (w == null)
			{
				word.add(null);
			}
			else
			{
				word.addAll(w);
			}
		
		}

	}

	//you will find it helpful to write a method called findFollow(str) on the Word class You can make these methods return null if there is no match.
	void findFollow(String s,String w )
	{
		ArrayList<Follow> follow;
		for (Follow f : follow)
		{
			if (s == null)
			{
				follow.add(null);
			}
			else
			{
				follow.addAll(s);
			}
		}
	}

	//Write a method called printModel that prints out the model. It should print out each word and its follows. 
	//You can use the toString method on the ArrayList to print it out.
	void printModel()
	{
		for(Word w:word)
		{
			System.out.println(w);
		}
	}

	
	

	public class Word
	{
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

	


	

	
	


	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
