package in.codersclub.SpringBootExercises.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Word {
	private String sentence;
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public ArrayList<String> myword(String sentence){
		String[] words = sentence.split(" ");
		ArrayList<String> wordsofsentence= new ArrayList<String>();
		for (String word1 : words) {
			wordsofsentence.add(word1);
			System.out.println(word1);
		}
	    return(wordsofsentence);
		
	}
	private String id;
	private String word;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Word(String id,String word) {
		super();
		this.id = id;
		this.word = word;
	}
	public Word() {

	}
}
