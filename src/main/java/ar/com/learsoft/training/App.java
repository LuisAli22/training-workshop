package ar.com.learsoft.training;

import ar.com.learsoft.training.utils.ArgumentValidator;

public class App 
{
    public static void main( String[] args ){
        try {
        	ArgumentValidator argumentValidator= new ArgumentValidator(args);
        	argumentValidator.validate();
        	String phrase= argumentValidator.getPhrase();
			PhraseAnalyzer phraseAnalyzer= new PhraseAnalyzer();
			phraseAnalyzer.printCount(phrase);
			phraseAnalyzer.countConsonants();
			phraseAnalyzer.printCount(phrase);
			phraseAnalyzer.countMoreThanThreeDifferentVowelsWords();
			phraseAnalyzer.printCount(phrase);
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
    }
}
