package ar.com.learsoft.training;

import java.util.List;

import ar.com.learsoft.training.state.ConsonantCounterState;
import ar.com.learsoft.training.state.MoreThanThreeDifferentVowelsWordCounterState;
import ar.com.learsoft.training.state.PhraseAnalyzerState;
import ar.com.learsoft.training.state.WordCounterState;

public class PhraseAnalyzer {
	
	private PhraseAnalyzerState state;

	public PhraseAnalyzer(){
		
		this.state = new WordCounterState();
	}
	
	
	
	public void printCount(String phrase) {
        this.state.printCount(phrase);
   
    }
	public void countWords() {
		this.state= new WordCounterState();
	}
	public void countConsonants() {
		this.state= new ConsonantCounterState();
	}
	
	public void countMoreThanThreeDifferentVowelsWords() {
		this.state= new MoreThanThreeDifferentVowelsWordCounterState();
	}
}
