package ie.tudublin;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class DANI extends PApplet {

	
	void loadFile()
	{
		String[] lines = loadStrings("java/data/small.txt");	
		for ( String line : lines)
		{
			String[] words = line.split(" ");
			for( String w : words )
			{
				w.replaceAll("[^\\w\\s]","");
				w.toLowerCase();
			}
		}

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

	
	


	public String[] writeSonnet()
	{
		return null;
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
