package ar.com.learsoft.training;

import ar.com.learsoft.training.utils.ArgumentValidator;

public class App 
{
    public static void main( String[] args ){
        try {
        	ArgumentValidator argumentValidator= new ArgumentValidator(args);
			PhraseAnalyzer phraseAnalyzer= new PhraseAnalyzer();
			String phrase= argumentValidator.getPhrase();
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
