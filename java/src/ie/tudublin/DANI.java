/*
 i don't feel proud of this work so it is okay if it is not marked 
 */
package ie.tudublin;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class DANI extends PApplet {

	
	/*void loadFile()
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

	}*/

	//rite a method on DANI.java called loadFile.

	/* 
	loadStrings("filename.txt"); // Load a text file into a String array
 split(line, ' '); // Split a string into an array of words
 w.replaceAll("[^\\w\\s]",""); // Remove punction characters
 s.toLowerCase() // Convert a string to lower case 
  */
	public void loadFile() {
        String[] lines = loadStrings("small.txt");
        for (String line : lines) {
            String[] words = line.split(" +");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[^\\w\\s]" , "");
                if (i == words.length - 1) {
                    model.add(new Word(words[i], new ArrayList<Follow>()));
                } else {
                    String nextWord = words[i+1].replaceAll("[^\\w\\s]","");
                    Word word = findWord(words[i]);
                    if (word == null) {
                        ArrayList<Follow> follows = new ArrayList<Follow>();
                        follows.add(new Follow(nextWord, 1));
                        model.add(new Word(words[i], follows));
                    } else {
                        Follow follow = null;
                        for (Follow f : word.getFollow()) {
                            if (f.getWord().equals(nextWord)) {
                                follow = f;
                                break;
                            }
                        }
                        if (follow == null) {
                            word.getFollow().add(new Follow(nextWord, 1));
                        } else {
                            follow.count++;
                        }
                    }
                }
            }
        }
    }

		
//a method called findWord(str) that finds a word in the model so you can check if it already exists.
	void findWord ()
	{
		ArrayList<Word> word;
		for (Word w : word)
		{
			//that finds a word in the model so you can check if it already exists
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


	

	//Write a method called printModel() that prints the model
	void printModel()
	{
		
		ArrayList<Follow> follow;

		for (Follow f : follow)

		{
			System.out.println(f);
		}

	}

	
	


	//Write a method on DANI called writeSonnet that returns a 14 line sonnet using the algorithm outlined at the start. 
	public String[] writeSonnet() {
		String[] sonnet = new String[14];
		for (int i = 0; i < sonnet.length; i++) {
			StringBuilder lineBuilder = new StringBuilder();
			Word word = getRandomWord();
			lineBuilder.append(word.getWord());
	
			for (int j = 1; j < 8; j++) {
				if (word.getFollow().isEmpty()) {
					break;
				}
	
				Follow follow = getRandomFollow(word);
				if (follow == null) {
					break;
				}
	
				lineBuilder.append(" ").append(follow.getWord());
				word = findWord( follow.getWord());
			}
	
			sonnet[i] = lineBuilder.toString();
		}
	
		
		for (String line : sonnet) {
			System.out.println(line);
		}
	
		
		String[] output = new String[sonnet.length + 1];
		output[0] = "SONNET";
		for (int i = 0; i < sonnet.length; i++) {
			output[i + 1] = sonnet[i];
		}
		return output;
	}
	



	private Follow getRandomFollow(Word word) {
		return null;
	}



	private Word findWord(Object word) {
		return null;
	}



	private Word getRandomWord() {
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

		if (keyCode == LEFT) {
			rigth sonnet;
		}
		if (keyCode == RIGHT) {
			left sonnet;
		}
		if (keyCode == ' ')
		{
			if ()
			{
				
			}
			else
			{
				
			}
		}

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

	public void drawSonnets()
    {
        for(Follow f : follow)
        {
            f.render(this);
        }
    }
}
